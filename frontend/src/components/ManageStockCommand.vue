<template>
    <v-card outlined>
        <v-card-title>
            ManageStock
        </v-card-title>

        <v-card-text>
            <String label="StockId" v-model="value.stockId" :editMode="editMode"/>
            <String label="FishId" v-model="value.fishId" :editMode="editMode"/>
            <Number label="Quantity" v-model="value.quantity" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="primary"
                    text
                    @click="manageStock"
            >
                ManageStock
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
        name: 'ManageStockCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.stockId = '';
            this.value.fishId = '';
            this.value.quantity = 0;
        },
        watch: {
        },
        methods: {
            manageStock() {
                this.$emit('manageStock', this.value);
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

