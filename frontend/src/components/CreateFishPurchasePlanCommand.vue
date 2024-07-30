<template>
    <v-card outlined>
        <v-card-title>
            CreateFishPurchasePlan
        </v-card-title>

        <v-card-text>
            <String label="PlanId" v-model="value.planId" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="primary"
                    text
                    @click="createFishPurchasePlan"
            >
                CreateFishPurchasePlan
            </v-btn>
            
            <v-btn
                    color="primary"
                    text
                    @click="close"
            >
                Close
            </v-btn>
        </v-card-actions>
    </v-card>

</template>

<script>
   
    export default {
        name: 'CreateFishPurchasePlanCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.planId = '';
        },
        watch: {
        },
        methods: {
            createFishPurchasePlan() {
                this.$emit('createFishPurchasePlan', this.value);
            },
            close() {
                this.$emit('closeDialog');
            },
            change() {
                this.$emit('input', this.value);
            },
        }
    }
</script>

