<template>
    <v-card outlined>
        <v-card-title>
            UpdateFishProductionStatus
        </v-card-title>

        <v-card-text>
            <String label="StatusId" v-model="value.statusId" :editMode="editMode"/>
            <String label="ProductionId" v-model="value.productionId" :editMode="editMode"/>
            <String label="Status" v-model="value.status" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="primary"
                    text
                    @click="updateFishProductionStatus"
            >
                UpdateFishProductionStatus
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
        name: 'UpdateFishProductionStatusCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.statusId = '';
            this.value.productionId = '';
            this.value.status = '';
        },
        watch: {
        },
        methods: {
            updateFishProductionStatus() {
                this.$emit('updateFishProductionStatus', this.value);
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

