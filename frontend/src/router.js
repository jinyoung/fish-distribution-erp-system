
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import SupplyChainManagementSupplierRegistrationManager from "./components/listers/SupplyChainManagementSupplierRegistrationCards"
import SupplyChainManagementSupplierRegistrationDetail from "./components/listers/SupplyChainManagementSupplierRegistrationDetail"
import SupplyChainManagementFishPurchasePlanManager from "./components/listers/SupplyChainManagementFishPurchasePlanCards"
import SupplyChainManagementFishPurchasePlanDetail from "./components/listers/SupplyChainManagementFishPurchasePlanDetail"
import SupplyChainManagementFishOrderManager from "./components/listers/SupplyChainManagementFishOrderCards"
import SupplyChainManagementFishOrderDetail from "./components/listers/SupplyChainManagementFishOrderDetail"
import SupplyChainManagementStockManager from "./components/listers/SupplyChainManagementStockCards"
import SupplyChainManagementStockDetail from "./components/listers/SupplyChainManagementStockDetail"

import ProductionManagementHarvestInformationManager from "./components/listers/ProductionManagementHarvestInformationCards"
import ProductionManagementHarvestInformationDetail from "./components/listers/ProductionManagementHarvestInformationDetail"
import ProductionManagementFishProductionPlanManager from "./components/listers/ProductionManagementFishProductionPlanCards"
import ProductionManagementFishProductionPlanDetail from "./components/listers/ProductionManagementFishProductionPlanDetail"
import ProductionManagementFishProductionStatusManager from "./components/listers/ProductionManagementFishProductionStatusCards"
import ProductionManagementFishProductionStatusDetail from "./components/listers/ProductionManagementFishProductionStatusDetail"

import ProductManagementProductManager from "./components/listers/ProductManagementProductCards"
import ProductManagementProductDetail from "./components/listers/ProductManagementProductDetail"
import ProductManagementProductOrderManager from "./components/listers/ProductManagementProductOrderCards"
import ProductManagementProductOrderDetail from "./components/listers/ProductManagementProductOrderDetail"
import ProductManagementProductSaleManager from "./components/listers/ProductManagementProductSaleCards"
import ProductManagementProductSaleDetail from "./components/listers/ProductManagementProductSaleDetail"

import FinancialManagementPaymentManager from "./components/listers/FinancialManagementPaymentCards"
import FinancialManagementPaymentDetail from "./components/listers/FinancialManagementPaymentDetail"
import FinancialManagementAccountingManager from "./components/listers/FinancialManagementAccountingCards"
import FinancialManagementAccountingDetail from "./components/listers/FinancialManagementAccountingDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/supplyChainManagements/supplierRegistrations',
                name: 'SupplyChainManagementSupplierRegistrationManager',
                component: SupplyChainManagementSupplierRegistrationManager
            },
            {
                path: '/supplyChainManagements/supplierRegistrations/:id',
                name: 'SupplyChainManagementSupplierRegistrationDetail',
                component: SupplyChainManagementSupplierRegistrationDetail
            },
            {
                path: '/supplyChainManagements/fishPurchasePlans',
                name: 'SupplyChainManagementFishPurchasePlanManager',
                component: SupplyChainManagementFishPurchasePlanManager
            },
            {
                path: '/supplyChainManagements/fishPurchasePlans/:id',
                name: 'SupplyChainManagementFishPurchasePlanDetail',
                component: SupplyChainManagementFishPurchasePlanDetail
            },
            {
                path: '/supplyChainManagements/fishOrders',
                name: 'SupplyChainManagementFishOrderManager',
                component: SupplyChainManagementFishOrderManager
            },
            {
                path: '/supplyChainManagements/fishOrders/:id',
                name: 'SupplyChainManagementFishOrderDetail',
                component: SupplyChainManagementFishOrderDetail
            },
            {
                path: '/supplyChainManagements/stocks',
                name: 'SupplyChainManagementStockManager',
                component: SupplyChainManagementStockManager
            },
            {
                path: '/supplyChainManagements/stocks/:id',
                name: 'SupplyChainManagementStockDetail',
                component: SupplyChainManagementStockDetail
            },

            {
                path: '/productionManagements/harvestInformations',
                name: 'ProductionManagementHarvestInformationManager',
                component: ProductionManagementHarvestInformationManager
            },
            {
                path: '/productionManagements/harvestInformations/:id',
                name: 'ProductionManagementHarvestInformationDetail',
                component: ProductionManagementHarvestInformationDetail
            },
            {
                path: '/productionManagements/fishProductionPlans',
                name: 'ProductionManagementFishProductionPlanManager',
                component: ProductionManagementFishProductionPlanManager
            },
            {
                path: '/productionManagements/fishProductionPlans/:id',
                name: 'ProductionManagementFishProductionPlanDetail',
                component: ProductionManagementFishProductionPlanDetail
            },
            {
                path: '/productionManagements/fishProductionStatuses',
                name: 'ProductionManagementFishProductionStatusManager',
                component: ProductionManagementFishProductionStatusManager
            },
            {
                path: '/productionManagements/fishProductionStatuses/:id',
                name: 'ProductionManagementFishProductionStatusDetail',
                component: ProductionManagementFishProductionStatusDetail
            },

            {
                path: '/productManagements/products',
                name: 'ProductManagementProductManager',
                component: ProductManagementProductManager
            },
            {
                path: '/productManagements/products/:id',
                name: 'ProductManagementProductDetail',
                component: ProductManagementProductDetail
            },
            {
                path: '/productManagements/productOrders',
                name: 'ProductManagementProductOrderManager',
                component: ProductManagementProductOrderManager
            },
            {
                path: '/productManagements/productOrders/:id',
                name: 'ProductManagementProductOrderDetail',
                component: ProductManagementProductOrderDetail
            },
            {
                path: '/productManagements/productSales',
                name: 'ProductManagementProductSaleManager',
                component: ProductManagementProductSaleManager
            },
            {
                path: '/productManagements/productSales/:id',
                name: 'ProductManagementProductSaleDetail',
                component: ProductManagementProductSaleDetail
            },

            {
                path: '/financialManagements/payments',
                name: 'FinancialManagementPaymentManager',
                component: FinancialManagementPaymentManager
            },
            {
                path: '/financialManagements/payments/:id',
                name: 'FinancialManagementPaymentDetail',
                component: FinancialManagementPaymentDetail
            },
            {
                path: '/financialManagements/accountings',
                name: 'FinancialManagementAccountingManager',
                component: FinancialManagementAccountingManager
            },
            {
                path: '/financialManagements/accountings/:id',
                name: 'FinancialManagementAccountingDetail',
                component: FinancialManagementAccountingDetail
            },



    ]
})
