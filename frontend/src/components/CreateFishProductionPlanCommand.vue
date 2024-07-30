<template>
    <v-card outlined>
        <v-card-title>
            CreateFishProductionPlan
        </v-card-title>

        <v-card-text>
            <String label="PlanId" v-model="value.planId" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="primary"
                    text
                    @click="createFishProductionPlan"
            >
                CreateFishProductionPlan
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
        name: 'CreateFishProductionPlanCommand',
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
            createFishProductionPlan() {
                this.$emit('createFishProductionPlan', this.value);
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

