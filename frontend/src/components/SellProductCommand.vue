<template>
    <v-card outlined>
        <v-card-title>
            SellProduct
        </v-card-title>

        <v-card-text>
            <String label="SaleId" v-model="value.saleId" :editMode="editMode"/>
            <String label="ProductId" v-model="value.productId" :editMode="editMode"/>
            <Number label="Quantity" v-model="value.quantity" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="primary"
                    text
                    @click="sellProduct"
            >
                SellProduct
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
        name: 'SellProductCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.saleId = '';
            this.value.productId = '';
            this.value.quantity = 0;
        },
        watch: {
        },
        methods: {
            sellProduct() {
                this.$emit('sellProduct', this.value);
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

