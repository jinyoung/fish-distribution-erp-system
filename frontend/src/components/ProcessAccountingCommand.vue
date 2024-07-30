<template>
    <v-card outlined>
        <v-card-title>
            ProcessAccounting
        </v-card-title>

        <v-card-text>
            <String label="AccountId" v-model="value.accountId" :editMode="editMode"/>
            <String label="Data" v-model="value.data" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="primary"
                    text
                    @click="processAccounting"
            >
                ProcessAccounting
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
        name: 'ProcessAccountingCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.accountId = '';
            this.value.data = '';
        },
        watch: {
        },
        methods: {
            processAccounting() {
                this.$emit('processAccounting', this.value);
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

