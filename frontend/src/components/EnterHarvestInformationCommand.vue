<template>
    <v-card outlined>
        <v-card-title>
            EnterHarvestInformation
        </v-card-title>

        <v-card-text>
            <String label="HarvestId" v-model="value.harvestId" :editMode="editMode"/>
            <String label="FishId" v-model="value.fishId" :editMode="editMode"/>
            <Number label="Quantity" v-model="value.quantity" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="primary"
                    text
                    @click="enterHarvestInformation"
            >
                EnterHarvestInformation
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
        name: 'EnterHarvestInformationCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.harvestId = '';
            this.value.fishId = '';
            this.value.quantity = 0;
        },
        watch: {
        },
        methods: {
            enterHarvestInformation() {
                this.$emit('enterHarvestInformation', this.value);
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

