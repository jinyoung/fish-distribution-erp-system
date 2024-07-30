

<template>
    <v-app id="inspire">
        <div>
            <v-app-bar color="primary" app clipped-left flat>
                <v-toolbar-title>
                    <span class="second-word font uppercase"
                        style="font-weight:700;"
                    >
                        <v-app-bar-nav-icon
                            @click="openSideBar()"
                            style="z-index:1;
                            height:56px;
                            width:30px;
                            margin-right:10px;
                            font-weight:300;
                            font-size:55px;"
                        >
                            <div style="line-height:100%;">≡</div>
                        </v-app-bar-nav-icon>
                    </span>
                </v-toolbar-title>
                <span v-if="urlPath!=null" 
                    class="mdi mdi-home" 
                    key="" 
                    to="/" 
                    @click="goHome()"
                    style="margin-left:10px; font-size:20px; cursor:pointer;"
		        ></span> 
                <v-spacer></v-spacer>

            </v-app-bar>

            <v-navigation-drawer app clipped flat v-model="sideBar">
                <v-list>
                    <v-list-item
                        class="px-2"
                        key="supplierRegistrations"
                        to="/supplyChainManagements/supplierRegistrations"
                        @click="changeUrl()"
                        color="primary"
                        style="font-weight:700;"
                    >
                        Supplier Registration
                    </v-list-item>

                    <v-list-item
                        class="px-2"
                        key="fishPurchasePlans"
                        to="/supplyChainManagements/fishPurchasePlans"
                        @click="changeUrl()"
                        color="primary"
                        style="font-weight:700;"
                    >
                        Fish Purchase Plan
                    </v-list-item>

                    <v-list-item
                        class="px-2"
                        key="fishOrders"
                        to="/supplyChainManagements/fishOrders"
                        @click="changeUrl()"
                        color="primary"
                        style="font-weight:700;"
                    >
                        Fish Order
                    </v-list-item>

                    <v-list-item
                        class="px-2"
                        key="stocks"
                        to="/supplyChainManagements/stocks"
                        @click="changeUrl()"
                        color="primary"
                        style="font-weight:700;"
                    >
                        Stock
                    </v-list-item>


                    <v-list-item
                        class="px-2"
                        key="harvestInformations"
                        to="/productionManagements/harvestInformations"
                        @click="changeUrl()"
                        color="primary"
                        style="font-weight:700;"
                    >
                        Harvest Information
                    </v-list-item>

                    <v-list-item
                        class="px-2"
                        key="fishProductionPlans"
                        to="/productionManagements/fishProductionPlans"
                        @click="changeUrl()"
                        color="primary"
                        style="font-weight:700;"
                    >
                        Fish Production Plan
                    </v-list-item>

                    <v-list-item
                        class="px-2"
                        key="fishProductionStatuses"
                        to="/productionManagements/fishProductionStatuses"
                        @click="changeUrl()"
                        color="primary"
                        style="font-weight:700;"
                    >
                        Fish Production Status
                    </v-list-item>


                    <v-list-item
                        class="px-2"
                        key="products"
                        to="/productManagements/products"
                        @click="changeUrl()"
                        color="primary"
                        style="font-weight:700;"
                    >
                        Product
                    </v-list-item>

                    <v-list-item
                        class="px-2"
                        key="productOrders"
                        to="/productManagements/productOrders"
                        @click="changeUrl()"
                        color="primary"
                        style="font-weight:700;"
                    >
                        Product Order
                    </v-list-item>

                    <v-list-item
                        class="px-2"
                        key="productSales"
                        to="/productManagements/productSales"
                        @click="changeUrl()"
                        color="primary"
                        style="font-weight:700;"
                    >
                        Product Sale
                    </v-list-item>


                    <v-list-item
                        class="px-2"
                        key="payments"
                        to="/financialManagements/payments"
                        @click="changeUrl()"
                        color="primary"
                        style="font-weight:700;"
                    >
                        Payment
                    </v-list-item>

                    <v-list-item
                        class="px-2"
                        key="accountings"
                        to="/financialManagements/accountings"
                        @click="changeUrl()"
                        color="primary"
                        style="font-weight:700;"
                    >
                        Accounting
                    </v-list-item>


                </v-list>
            </v-navigation-drawer>
        </div>

        <v-main>
            <v-container style="padding:0px;" v-if="urlPath" fluid>
                <router-view></router-view>
            </v-container>
            <v-container style="padding:0px;" v-else fluid>
                <div style="width:100%; margin:0px 0px 20px 0px; position: relative;">
                    <v-img style="width:100%; height:300px;"
                        src=""
                    ></v-img>
                    <div class="App-main-text-overlap"></div>
                    <div class="App-sub-text-overlap"></div>
                </div>
                <v-row>
                    <v-col cols="4" class="d-flex justify-center" v-for="(aggregate, index) in aggregate" :key="index">
                        <div 
                            class="flip-card"
                            @mouseover="flipCard(index)"
                            @mouseleave="unflipCard(index)"
                            :class="{ 'is-flipped': flipped[index] }"
                        >
                            <div class="flip-card-inner">
                                <div class="flip-card-front">
                                    <v-card
                                        class="mx-auto"
                                        style="width:300px; min-height: 310px; margin-bottom:20px; text-align: center; border-radius: 10px;"
                                        outlined
                                    >
                                        <v-list-item style="padding:15px; margin:0px;">
                                            <v-img style="width:100%; height:120px; border-radius: 10px;" :src="aggregate.ImageUrl"></v-img>
                                        </v-list-item>
                                        <div style="text-align: left; padding:10px 15px 15px 15px; margin-top:-10px;">
                                            <h2>{{ aggregate.title }}</h2>
                                            <div>{{ aggregate.description }}</div>
                                        </div>
                                    </v-card>
                                </div>
                                <div class="flip-card-back">
                                    <v-card
                                        color="primary"
                                        class="mx-auto"
                                        style="width:300px; min-height: 310px; margin-bottom:20px; text-align: center; border-radius: 10px;"
                                        outlined
                                        :key="aggregate.key"
                                        :to="aggregate.route"
                                        @click="changeUrl()"
                                    >
                                        <v-list-item style="padding:15px; margin:0px;">
                                            <v-img style="width:100%; height:120px; border-radius: 10px;" :src="aggregate.ImageUrl"></v-img>
                                        </v-list-item>
                                        <h2 style="color:white;">{{ aggregate.title }} 관리</h2>
                                    </v-card>
                                </div>
                            </div>
                        </div>
                    </v-col>
                </v-row>
            </v-container>
        </v-main>
    </v-app>
</template>

<script>

export default {
    name: "App",
    data: () => ({
        useComponent: "",
        drawer: true,
        components: [],
        sideBar: true,
        urlPath: null,
        flipped: [],
        ImageUrl: '',
        aggregate: [
            { 
                title: 'Supplier Registration', 
                description: 'The process of registering a fish supplier in the system', 
                key: 'supplierRegistrations', 
                route: '/supplyChainManagements/supplierRegistrations',
                ImageUrl: '',
            },
            { 
                title: 'Fish Purchase Plan', 
                description: 'The plan for purchasing fish', 
                key: 'fishPurchasePlans', 
                route: '/supplyChainManagements/fishPurchasePlans',
                ImageUrl: '',
            },
            { 
                title: 'Fish Order', 
                description: 'The order for fish', 
                key: 'fishOrders', 
                route: '/supplyChainManagements/fishOrders',
                ImageUrl: '',
            },
            { 
                title: 'Stock', 
                description: 'The stock of fish', 
                key: 'stocks', 
                route: '/supplyChainManagements/stocks',
                ImageUrl: '',
            },
            { 
                title: 'Harvest Information', 
                description: 'The information about fish harvest', 
                key: 'harvestInformations', 
                route: '/productionManagements/harvestInformations',
                ImageUrl: '',
            },
            { 
                title: 'Fish Production Plan', 
                description: 'The plan for fish production', 
                key: 'fishProductionPlans', 
                route: '/productionManagements/fishProductionPlans',
                ImageUrl: '',
            },
            { 
                title: 'Fish Production Status', 
                description: 'The status of fish production', 
                key: 'fishProductionStatuses', 
                route: '/productionManagements/fishProductionStatuses',
                ImageUrl: '',
            },
            { 
                title: 'Product', 
                description: 'The fish product', 
                key: 'products', 
                route: '/productManagements/products',
                ImageUrl: '',
            },
            { 
                title: 'Product Order', 
                description: 'The order for fish product', 
                key: 'productOrders', 
                route: '/productManagements/productOrders',
                ImageUrl: '',
            },
            { 
                title: 'Product Sale', 
                description: 'The sale of fish product', 
                key: 'productSales', 
                route: '/productManagements/productSales',
                ImageUrl: '',
            },
            { 
                title: 'Payment', 
                description: 'The payment for fish product', 
                key: 'payments', 
                route: '/financialManagements/payments',
                ImageUrl: '',
            },
            { 
                title: 'Accounting', 
                description: 'The accounting data', 
                key: 'accountings', 
                route: '/financialManagements/accountings',
                ImageUrl: '',
            },
            
        ],
    }),
    
    async created() {
      var path = document.location.href.split("#/")
      this.urlPath = path[1];

    },
    watch: {
        cards(newCards) {
            this.flipped = new Array(newCards.length).fill(false);
        },
    },

    mounted() {
        var me = this;
        me.components = this.$ManagerLists;
    },

    methods: {
        openSideBar(){
            this.sideBar = !this.sideBar
        },
        changeUrl() {
            var path = document.location.href.split("#/")
            this.urlPath = path[1];
            this.flipped.fill(false);
        },
        goHome() {
            this.urlPath = null;
        },
        flipCard(index) {
            this.$set(this.flipped, index, true);
        },
        unflipCard(index) {
            this.$set(this.flipped, index, false);
        },
    }
};
</script>
<style>
</style>
