<template>
    <v-card outlined>
        <v-card-title>
            ProcessPayment
        </v-card-title>

        <v-card-text>
            <String label="PaymentId" v-model="value.paymentId" :editMode="editMode"/>
            <String label="OrderId" v-model="value.orderId" :editMode="editMode"/>
            <Number label="Amount" v-model="value.amount" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="primary"
                    text
                    @click="processPayment"
            >
                ProcessPayment
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
        name: 'ProcessPaymentCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.paymentId = '';
            this.value.orderId = '';
            this.value.amount = 0;
        },
        watch: {
        },
        methods: {
            processPayment() {
                this.$emit('processPayment', this.value);
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

