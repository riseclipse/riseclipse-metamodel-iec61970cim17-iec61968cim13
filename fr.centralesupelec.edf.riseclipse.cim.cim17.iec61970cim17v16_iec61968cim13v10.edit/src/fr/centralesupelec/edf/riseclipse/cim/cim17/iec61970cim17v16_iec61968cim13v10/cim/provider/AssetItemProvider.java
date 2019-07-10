/*
*************************************************************************
**  Copyright (c) 2019 CentraleSupélec & EDF.
**  All rights reserved. This program and the accompanying materials
**  are made available under the terms of the Eclipse Public License v2.0
**  which accompanies this distribution, and is available at
**  https://www.eclipse.org/legal/epl-v20.html
** 
**  This file is part of the RiseClipse tool
**  
**  Contributors:
**      Computer Science Department, CentraleSupélec
**      EDF R&D
**  Contacts:
**      dominique.marcadet@centralesupelec.fr
**      aurelie.dehouck-neveu@edf.fr
**  Web site:
**      http://wdi.supelec.fr/software/RiseClipse/
*************************************************************************
*/
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.provider;

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimFactory;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AssetItemProvider extends IdentifiedObjectItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AssetItemProvider( AdapterFactory adapterFactory ) {
        super( adapterFactory );
    }

    /**
     * This returns the property descriptors for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public List< IItemPropertyDescriptor > getPropertyDescriptors( Object object ) {
        if( itemPropertyDescriptors == null ) {
            super.getPropertyDescriptors( object );

            addBaselineConditionPropertyDescriptor( object );
            addBaselineLossOfLifePropertyDescriptor( object );
            addCriticalPropertyDescriptor( object );
            addInUseStatePropertyDescriptor( object );
            addKindPropertyDescriptor( object );
            addLifecycleStatePropertyDescriptor( object );
            addLotNumberPropertyDescriptor( object );
            addPositionPropertyDescriptor( object );
            addPurchasePricePropertyDescriptor( object );
            addRetiredReasonPropertyDescriptor( object );
            addSerialNumberPropertyDescriptor( object );
            addTypePropertyDescriptor( object );
            addUtcNumberPropertyDescriptor( object );
            addReplacementWorkTasksPropertyDescriptor( object );
            addAnalyticPropertyDescriptor( object );
            addProductAssetModelPropertyDescriptor( object );
            addProceduresPropertyDescriptor( object );
            addScheduledEventsPropertyDescriptor( object );
            addOwnershipsPropertyDescriptor( object );
            addConfigurationEventsPropertyDescriptor( object );
            addWorkTasksPropertyDescriptor( object );
            addOperationalTagsPropertyDescriptor( object );
            addBreakerOperationPropertyDescriptor( object );
            addOrganisationRolesPropertyDescriptor( object );
            addLocationPropertyDescriptor( object );
            addMeasurementsPropertyDescriptor( object );
            addActivityRecordsPropertyDescriptor( object );
            addFinancialInfoPropertyDescriptor( object );
            addProcedureDataSetPropertyDescriptor( object );
            addMediumPropertyDescriptor( object );
            addAssetContainerPropertyDescriptor( object );
            addAssetDeploymentPropertyDescriptor( object );
            addAnalyticScorePropertyDescriptor( object );
            addPowerSystemResourcesPropertyDescriptor( object );
            addAssetInfoPropertyDescriptor( object );
            addAssetGroupPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Baseline Condition feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addBaselineConditionPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Asset_baselineCondition_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Asset_baselineCondition_feature",
                                "_UI_Asset_type" ),
                        CimPackage.eINSTANCE.getAsset_BaselineCondition(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Baseline Loss Of Life feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addBaselineLossOfLifePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Asset_baselineLossOfLife_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Asset_baselineLossOfLife_feature",
                                "_UI_Asset_type" ),
                        CimPackage.eINSTANCE.getAsset_BaselineLossOfLife(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Critical feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCriticalPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Asset_critical_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Asset_critical_feature",
                                "_UI_Asset_type" ),
                        CimPackage.eINSTANCE.getAsset_Critical(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the In Use State feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addInUseStatePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Asset_inUseState_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Asset_inUseState_feature",
                                "_UI_Asset_type" ),
                        CimPackage.eINSTANCE.getAsset_InUseState(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Kind feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKindPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Asset_kind_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Asset_kind_feature", "_UI_Asset_type" ),
                        CimPackage.eINSTANCE.getAsset_Kind(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Lifecycle State feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLifecycleStatePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Asset_lifecycleState_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Asset_lifecycleState_feature",
                                "_UI_Asset_type" ),
                        CimPackage.eINSTANCE.getAsset_LifecycleState(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Lot Number feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLotNumberPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Asset_lotNumber_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Asset_lotNumber_feature",
                                "_UI_Asset_type" ),
                        CimPackage.eINSTANCE.getAsset_LotNumber(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Position feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPositionPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Asset_position_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Asset_position_feature",
                                "_UI_Asset_type" ),
                        CimPackage.eINSTANCE.getAsset_Position(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Purchase Price feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPurchasePricePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Asset_purchasePrice_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Asset_purchasePrice_feature",
                                "_UI_Asset_type" ),
                        CimPackage.eINSTANCE.getAsset_PurchasePrice(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Retired Reason feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRetiredReasonPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Asset_retiredReason_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Asset_retiredReason_feature",
                                "_UI_Asset_type" ),
                        CimPackage.eINSTANCE.getAsset_RetiredReason(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Serial Number feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSerialNumberPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Asset_serialNumber_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Asset_serialNumber_feature",
                                "_UI_Asset_type" ),
                        CimPackage.eINSTANCE.getAsset_SerialNumber(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Type feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTypePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Asset_type_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Asset_type_feature", "_UI_Asset_type" ),
                        CimPackage.eINSTANCE.getAsset_Type(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Utc Number feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUtcNumberPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Asset_utcNumber_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Asset_utcNumber_feature",
                                "_UI_Asset_type" ),
                        CimPackage.eINSTANCE.getAsset_UtcNumber(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Replacement Work Tasks feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addReplacementWorkTasksPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Asset_ReplacementWorkTasks_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Asset_ReplacementWorkTasks_feature",
                                "_UI_Asset_type" ),
                        CimPackage.eINSTANCE.getAsset_ReplacementWorkTasks(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Analytic feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAnalyticPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Asset_Analytic_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Asset_Analytic_feature",
                                "_UI_Asset_type" ),
                        CimPackage.eINSTANCE.getAsset_Analytic(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Product Asset Model feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addProductAssetModelPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Asset_ProductAssetModel_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Asset_ProductAssetModel_feature",
                                "_UI_Asset_type" ),
                        CimPackage.eINSTANCE.getAsset_ProductAssetModel(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Procedures feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addProceduresPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Asset_Procedures_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Asset_Procedures_feature",
                                "_UI_Asset_type" ),
                        CimPackage.eINSTANCE.getAsset_Procedures(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Scheduled Events feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addScheduledEventsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Asset_ScheduledEvents_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Asset_ScheduledEvents_feature",
                                "_UI_Asset_type" ),
                        CimPackage.eINSTANCE.getAsset_ScheduledEvents(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Ownerships feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addOwnershipsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Asset_Ownerships_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Asset_Ownerships_feature",
                                "_UI_Asset_type" ),
                        CimPackage.eINSTANCE.getAsset_Ownerships(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Configuration Events feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addConfigurationEventsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Asset_ConfigurationEvents_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Asset_ConfigurationEvents_feature",
                                "_UI_Asset_type" ),
                        CimPackage.eINSTANCE.getAsset_ConfigurationEvents(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Work Tasks feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addWorkTasksPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Asset_WorkTasks_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Asset_WorkTasks_feature",
                                "_UI_Asset_type" ),
                        CimPackage.eINSTANCE.getAsset_WorkTasks(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Operational Tags feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addOperationalTagsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Asset_OperationalTags_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Asset_OperationalTags_feature",
                                "_UI_Asset_type" ),
                        CimPackage.eINSTANCE.getAsset_OperationalTags(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Breaker Operation feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addBreakerOperationPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Asset_BreakerOperation_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Asset_BreakerOperation_feature",
                                "_UI_Asset_type" ),
                        CimPackage.eINSTANCE.getAsset_BreakerOperation(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Organisation Roles feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addOrganisationRolesPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Asset_OrganisationRoles_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Asset_OrganisationRoles_feature",
                                "_UI_Asset_type" ),
                        CimPackage.eINSTANCE.getAsset_OrganisationRoles(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Location feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLocationPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Asset_Location_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Asset_Location_feature",
                                "_UI_Asset_type" ),
                        CimPackage.eINSTANCE.getAsset_Location(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Measurements feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMeasurementsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Asset_Measurements_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Asset_Measurements_feature",
                                "_UI_Asset_type" ),
                        CimPackage.eINSTANCE.getAsset_Measurements(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Activity Records feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addActivityRecordsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Asset_ActivityRecords_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Asset_ActivityRecords_feature",
                                "_UI_Asset_type" ),
                        CimPackage.eINSTANCE.getAsset_ActivityRecords(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Financial Info feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFinancialInfoPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Asset_FinancialInfo_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Asset_FinancialInfo_feature",
                                "_UI_Asset_type" ),
                        CimPackage.eINSTANCE.getAsset_FinancialInfo(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Procedure Data Set feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addProcedureDataSetPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Asset_ProcedureDataSet_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Asset_ProcedureDataSet_feature",
                                "_UI_Asset_type" ),
                        CimPackage.eINSTANCE.getAsset_ProcedureDataSet(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Medium feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMediumPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Asset_Medium_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Asset_Medium_feature", "_UI_Asset_type" ),
                        CimPackage.eINSTANCE.getAsset_Medium(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Asset Container feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAssetContainerPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Asset_AssetContainer_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Asset_AssetContainer_feature",
                                "_UI_Asset_type" ),
                        CimPackage.eINSTANCE.getAsset_AssetContainer(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Asset Deployment feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAssetDeploymentPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Asset_AssetDeployment_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Asset_AssetDeployment_feature",
                                "_UI_Asset_type" ),
                        CimPackage.eINSTANCE.getAsset_AssetDeployment(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Analytic Score feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAnalyticScorePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Asset_AnalyticScore_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Asset_AnalyticScore_feature",
                                "_UI_Asset_type" ),
                        CimPackage.eINSTANCE.getAsset_AnalyticScore(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Power System Resources feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPowerSystemResourcesPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Asset_PowerSystemResources_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Asset_PowerSystemResources_feature",
                                "_UI_Asset_type" ),
                        CimPackage.eINSTANCE.getAsset_PowerSystemResources(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Asset Info feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAssetInfoPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Asset_AssetInfo_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Asset_AssetInfo_feature",
                                "_UI_Asset_type" ),
                        CimPackage.eINSTANCE.getAsset_AssetInfo(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Asset Group feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAssetGroupPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Asset_AssetGroup_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Asset_AssetGroup_feature",
                                "_UI_Asset_type" ),
                        CimPackage.eINSTANCE.getAsset_AssetGroup(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
     * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
     * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Collection< ? extends EStructuralFeature > getChildrenFeatures( Object object ) {
        if( childrenFeatures == null ) {
            super.getChildrenFeatures( object );
            childrenFeatures.add( CimPackage.eINSTANCE.getAsset_AcceptanceTest() );
            childrenFeatures.add( CimPackage.eINSTANCE.getAsset_ElectronicAddress() );
            childrenFeatures.add( CimPackage.eINSTANCE.getAsset_InUseDate() );
            childrenFeatures.add( CimPackage.eINSTANCE.getAsset_LifecycleDate() );
            childrenFeatures.add( CimPackage.eINSTANCE.getAsset_Status() );
        }
        return childrenFeatures;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EStructuralFeature getChildFeature( Object object, Object child ) {
        // Check the type of the specified child object and return the proper feature to use for
        // adding (see {@link AddCommand}) it as a child.

        return super.getChildFeature( object, child );
    }

    /**
     * This returns Asset.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/Asset" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( Asset ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_Asset_type" )
                : getString( "_UI_Asset_type" ) + " " + label;
    }

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void notifyChanged( Notification notification ) {
        updateChildren( notification );

        switch( notification.getFeatureID( Asset.class ) ) {
        case CimPackage.ASSET__BASELINE_CONDITION:
        case CimPackage.ASSET__BASELINE_LOSS_OF_LIFE:
        case CimPackage.ASSET__CRITICAL:
        case CimPackage.ASSET__IN_USE_STATE:
        case CimPackage.ASSET__KIND:
        case CimPackage.ASSET__LIFECYCLE_STATE:
        case CimPackage.ASSET__LOT_NUMBER:
        case CimPackage.ASSET__POSITION:
        case CimPackage.ASSET__PURCHASE_PRICE:
        case CimPackage.ASSET__RETIRED_REASON:
        case CimPackage.ASSET__SERIAL_NUMBER:
        case CimPackage.ASSET__TYPE:
        case CimPackage.ASSET__UTC_NUMBER:
            fireNotifyChanged( new ViewerNotification( notification, notification.getNotifier(), false, true ) );
            return;
        case CimPackage.ASSET__ACCEPTANCE_TEST:
        case CimPackage.ASSET__ELECTRONIC_ADDRESS:
        case CimPackage.ASSET__IN_USE_DATE:
        case CimPackage.ASSET__LIFECYCLE_DATE:
        case CimPackage.ASSET__STATUS:
            fireNotifyChanged( new ViewerNotification( notification, notification.getNotifier(), true, false ) );
            return;
        }
        super.notifyChanged( notification );
    }

    /**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
     * that can be created under this object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected void collectNewChildDescriptors( Collection< Object > newChildDescriptors, Object object ) {
        super.collectNewChildDescriptors( newChildDescriptors, object );

        newChildDescriptors.add( createChildParameter( CimPackage.eINSTANCE.getAsset_AcceptanceTest(),
                CimFactory.eINSTANCE.createAcceptanceTest() ) );

        newChildDescriptors.add( createChildParameter( CimPackage.eINSTANCE.getAsset_ElectronicAddress(),
                CimFactory.eINSTANCE.createElectronicAddress() ) );

        newChildDescriptors.add( createChildParameter( CimPackage.eINSTANCE.getAsset_InUseDate(),
                CimFactory.eINSTANCE.createInUseDate() ) );

        newChildDescriptors.add( createChildParameter( CimPackage.eINSTANCE.getAsset_LifecycleDate(),
                CimFactory.eINSTANCE.createLifecycleDate() ) );

        newChildDescriptors.add( createChildParameter( CimPackage.eINSTANCE.getAsset_Status(),
                CimFactory.eINSTANCE.createStatus() ) );
    }

}
