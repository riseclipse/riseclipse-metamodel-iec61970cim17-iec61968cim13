/**
 *  Copyright (c) 2016 CentraleSupélec & EDF.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *  This file is part of the RiseClipse tool
 *  
 *  Contributors:
 *      Computer Science Department, CentraleSupélec : initial implementation
 *  Contacts:
 *      Dominique.Marcadet@centralesupelec.fr
 * 
 */
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.provider;

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProductAssetModel;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProductAssetModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ProductAssetModelItemProvider extends IdentifiedObjectItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ProductAssetModelItemProvider( AdapterFactory adapterFactory ) {
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

            addCatalogueNumberPropertyDescriptor( object );
            addCorporateStandardKindPropertyDescriptor( object );
            addDrawingNumberPropertyDescriptor( object );
            addInstructionManualPropertyDescriptor( object );
            addModelNumberPropertyDescriptor( object );
            addModelVersionPropertyDescriptor( object );
            addOverallLengthPropertyDescriptor( object );
            addStyleNumberPropertyDescriptor( object );
            addUsageKindPropertyDescriptor( object );
            addWeightTotalPropertyDescriptor( object );
            addAssetInfoPropertyDescriptor( object );
            addOperationalRestrictionsPropertyDescriptor( object );
            addCatalogAssetTypePropertyDescriptor( object );
            addManufacturerPropertyDescriptor( object );
            addAssetPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Catalogue Number feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCatalogueNumberPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_ProductAssetModel_catalogueNumber_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_ProductAssetModel_catalogueNumber_feature",
                        "_UI_ProductAssetModel_type" ),
                CimPackage.eINSTANCE.getProductAssetModel_CatalogueNumber(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Corporate Standard Kind feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCorporateStandardKindPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ProductAssetModel_corporateStandardKind_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_ProductAssetModel_corporateStandardKind_feature", "_UI_ProductAssetModel_type" ),
                        CimPackage.eINSTANCE.getProductAssetModel_CorporateStandardKind(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Drawing Number feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDrawingNumberPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_ProductAssetModel_drawingNumber_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_ProductAssetModel_drawingNumber_feature",
                        "_UI_ProductAssetModel_type" ),
                CimPackage.eINSTANCE.getProductAssetModel_DrawingNumber(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Instruction Manual feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addInstructionManualPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_ProductAssetModel_instructionManual_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_ProductAssetModel_instructionManual_feature",
                        "_UI_ProductAssetModel_type" ),
                CimPackage.eINSTANCE.getProductAssetModel_InstructionManual(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Model Number feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addModelNumberPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ProductAssetModel_modelNumber_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ProductAssetModel_modelNumber_feature",
                                "_UI_ProductAssetModel_type" ),
                        CimPackage.eINSTANCE.getProductAssetModel_ModelNumber(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Model Version feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addModelVersionPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_ProductAssetModel_modelVersion_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_ProductAssetModel_modelVersion_feature",
                        "_UI_ProductAssetModel_type" ),
                CimPackage.eINSTANCE.getProductAssetModel_ModelVersion(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Overall Length feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addOverallLengthPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_ProductAssetModel_overallLength_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_ProductAssetModel_overallLength_feature",
                        "_UI_ProductAssetModel_type" ),
                CimPackage.eINSTANCE.getProductAssetModel_OverallLength(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Style Number feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addStyleNumberPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ProductAssetModel_styleNumber_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ProductAssetModel_styleNumber_feature",
                                "_UI_ProductAssetModel_type" ),
                        CimPackage.eINSTANCE.getProductAssetModel_StyleNumber(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Usage Kind feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUsageKindPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ProductAssetModel_usageKind_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ProductAssetModel_usageKind_feature",
                                "_UI_ProductAssetModel_type" ),
                        CimPackage.eINSTANCE.getProductAssetModel_UsageKind(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Weight Total feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addWeightTotalPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ProductAssetModel_weightTotal_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ProductAssetModel_weightTotal_feature",
                                "_UI_ProductAssetModel_type" ),
                        CimPackage.eINSTANCE.getProductAssetModel_WeightTotal(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
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
                        getResourceLocator(), getString( "_UI_ProductAssetModel_AssetInfo_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ProductAssetModel_AssetInfo_feature",
                                "_UI_ProductAssetModel_type" ),
                        CimPackage.eINSTANCE.getProductAssetModel_AssetInfo(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Operational Restrictions feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addOperationalRestrictionsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ProductAssetModel_OperationalRestrictions_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_ProductAssetModel_OperationalRestrictions_feature", "_UI_ProductAssetModel_type" ),
                        CimPackage.eINSTANCE.getProductAssetModel_OperationalRestrictions(), true, false, true, null,
                        null, null ) );
    }

    /**
     * This adds a property descriptor for the Catalog Asset Type feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCatalogAssetTypePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_ProductAssetModel_CatalogAssetType_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_ProductAssetModel_CatalogAssetType_feature",
                        "_UI_ProductAssetModel_type" ),
                CimPackage.eINSTANCE.getProductAssetModel_CatalogAssetType(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Manufacturer feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addManufacturerPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_ProductAssetModel_Manufacturer_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_ProductAssetModel_Manufacturer_feature",
                        "_UI_ProductAssetModel_type" ),
                CimPackage.eINSTANCE.getProductAssetModel_Manufacturer(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Asset feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAssetPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ProductAssetModel_Asset_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ProductAssetModel_Asset_feature",
                                "_UI_ProductAssetModel_type" ),
                        CimPackage.eINSTANCE.getProductAssetModel_Asset(), true, false, true, null, null, null ) );
    }

    /**
     * This returns ProductAssetModel.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/ProductAssetModel" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( ProductAssetModel ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_ProductAssetModel_type" )
                : getString( "_UI_ProductAssetModel_type" ) + " " + label;
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

        switch( notification.getFeatureID( ProductAssetModel.class ) ) {
        case CimPackage.PRODUCT_ASSET_MODEL__CATALOGUE_NUMBER:
        case CimPackage.PRODUCT_ASSET_MODEL__CORPORATE_STANDARD_KIND:
        case CimPackage.PRODUCT_ASSET_MODEL__DRAWING_NUMBER:
        case CimPackage.PRODUCT_ASSET_MODEL__INSTRUCTION_MANUAL:
        case CimPackage.PRODUCT_ASSET_MODEL__MODEL_NUMBER:
        case CimPackage.PRODUCT_ASSET_MODEL__MODEL_VERSION:
        case CimPackage.PRODUCT_ASSET_MODEL__OVERALL_LENGTH:
        case CimPackage.PRODUCT_ASSET_MODEL__STYLE_NUMBER:
        case CimPackage.PRODUCT_ASSET_MODEL__USAGE_KIND:
        case CimPackage.PRODUCT_ASSET_MODEL__WEIGHT_TOTAL:
            fireNotifyChanged( new ViewerNotification( notification, notification.getNotifier(), false, true ) );
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
    }

}
