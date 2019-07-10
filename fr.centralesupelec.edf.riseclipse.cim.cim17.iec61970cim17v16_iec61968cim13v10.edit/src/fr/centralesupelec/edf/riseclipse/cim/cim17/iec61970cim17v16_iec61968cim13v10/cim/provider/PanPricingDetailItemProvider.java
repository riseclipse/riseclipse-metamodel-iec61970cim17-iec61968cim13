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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanPricingDetail;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanPricingDetail} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PanPricingDetailItemProvider extends CimObjectWithIDItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PanPricingDetailItemProvider( AdapterFactory adapterFactory ) {
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

            addAlternateCostDeliveredPropertyDescriptor( object );
            addAlternateCostUnitPropertyDescriptor( object );
            addCurrentTimeDatePropertyDescriptor( object );
            addGenerationPricePropertyDescriptor( object );
            addGenerationPriceRatioPropertyDescriptor( object );
            addPricePropertyDescriptor( object );
            addPriceRatioPropertyDescriptor( object );
            addPriceTierPropertyDescriptor( object );
            addPriceTierCountPropertyDescriptor( object );
            addPriceTierLabelPropertyDescriptor( object );
            addRateLabelPropertyDescriptor( object );
            addRegisterTierPropertyDescriptor( object );
            addUnitOfMeasurePropertyDescriptor( object );
            addPanPricingPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Alternate Cost Delivered feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAlternateCostDeliveredPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PanPricingDetail_alternateCostDelivered_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_PanPricingDetail_alternateCostDelivered_feature", "_UI_PanPricingDetail_type" ),
                        CimPackage.eINSTANCE.getPanPricingDetail_AlternateCostDelivered(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Alternate Cost Unit feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAlternateCostUnitPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_PanPricingDetail_alternateCostUnit_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_PanPricingDetail_alternateCostUnit_feature",
                        "_UI_PanPricingDetail_type" ),
                CimPackage.eINSTANCE.getPanPricingDetail_AlternateCostUnit(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Current Time Date feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCurrentTimeDatePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_PanPricingDetail_currentTimeDate_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_PanPricingDetail_currentTimeDate_feature",
                        "_UI_PanPricingDetail_type" ),
                CimPackage.eINSTANCE.getPanPricingDetail_CurrentTimeDate(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Generation Price feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addGenerationPricePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_PanPricingDetail_generationPrice_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_PanPricingDetail_generationPrice_feature",
                        "_UI_PanPricingDetail_type" ),
                CimPackage.eINSTANCE.getPanPricingDetail_GenerationPrice(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Generation Price Ratio feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addGenerationPriceRatioPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_PanPricingDetail_generationPriceRatio_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_PanPricingDetail_generationPriceRatio_feature",
                        "_UI_PanPricingDetail_type" ),
                CimPackage.eINSTANCE.getPanPricingDetail_GenerationPriceRatio(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Price feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPricePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PanPricingDetail_price_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PanPricingDetail_price_feature",
                                "_UI_PanPricingDetail_type" ),
                        CimPackage.eINSTANCE.getPanPricingDetail_Price(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Price Ratio feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPriceRatioPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PanPricingDetail_priceRatio_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PanPricingDetail_priceRatio_feature",
                                "_UI_PanPricingDetail_type" ),
                        CimPackage.eINSTANCE.getPanPricingDetail_PriceRatio(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Price Tier feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPriceTierPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PanPricingDetail_priceTier_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PanPricingDetail_priceTier_feature",
                                "_UI_PanPricingDetail_type" ),
                        CimPackage.eINSTANCE.getPanPricingDetail_PriceTier(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Price Tier Count feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPriceTierCountPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_PanPricingDetail_priceTierCount_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_PanPricingDetail_priceTierCount_feature",
                        "_UI_PanPricingDetail_type" ),
                CimPackage.eINSTANCE.getPanPricingDetail_PriceTierCount(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Price Tier Label feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPriceTierLabelPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_PanPricingDetail_priceTierLabel_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_PanPricingDetail_priceTierLabel_feature",
                        "_UI_PanPricingDetail_type" ),
                CimPackage.eINSTANCE.getPanPricingDetail_PriceTierLabel(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Rate Label feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRateLabelPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PanPricingDetail_rateLabel_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PanPricingDetail_rateLabel_feature",
                                "_UI_PanPricingDetail_type" ),
                        CimPackage.eINSTANCE.getPanPricingDetail_RateLabel(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Register Tier feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRegisterTierPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PanPricingDetail_registerTier_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PanPricingDetail_registerTier_feature",
                                "_UI_PanPricingDetail_type" ),
                        CimPackage.eINSTANCE.getPanPricingDetail_RegisterTier(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Unit Of Measure feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUnitOfMeasurePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PanPricingDetail_unitOfMeasure_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PanPricingDetail_unitOfMeasure_feature",
                                "_UI_PanPricingDetail_type" ),
                        CimPackage.eINSTANCE.getPanPricingDetail_UnitOfMeasure(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Pan Pricing feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPanPricingPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PanPricingDetail_PanPricing_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PanPricingDetail_PanPricing_feature",
                                "_UI_PanPricingDetail_type" ),
                        CimPackage.eINSTANCE.getPanPricingDetail_PanPricing(), true, false, true, null, null, null ) );
    }

    /**
     * This returns PanPricingDetail.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/PanPricingDetail" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( PanPricingDetail ) object ).getID();
        return label == null || label.length() == 0 ? getString( "_UI_PanPricingDetail_type" )
                : getString( "_UI_PanPricingDetail_type" ) + " " + label;
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

        switch( notification.getFeatureID( PanPricingDetail.class ) ) {
        case CimPackage.PAN_PRICING_DETAIL__ALTERNATE_COST_DELIVERED:
        case CimPackage.PAN_PRICING_DETAIL__ALTERNATE_COST_UNIT:
        case CimPackage.PAN_PRICING_DETAIL__CURRENT_TIME_DATE:
        case CimPackage.PAN_PRICING_DETAIL__GENERATION_PRICE:
        case CimPackage.PAN_PRICING_DETAIL__GENERATION_PRICE_RATIO:
        case CimPackage.PAN_PRICING_DETAIL__PRICE:
        case CimPackage.PAN_PRICING_DETAIL__PRICE_RATIO:
        case CimPackage.PAN_PRICING_DETAIL__PRICE_TIER:
        case CimPackage.PAN_PRICING_DETAIL__PRICE_TIER_COUNT:
        case CimPackage.PAN_PRICING_DETAIL__PRICE_TIER_LABEL:
        case CimPackage.PAN_PRICING_DETAIL__RATE_LABEL:
        case CimPackage.PAN_PRICING_DETAIL__REGISTER_TIER:
        case CimPackage.PAN_PRICING_DETAIL__UNIT_OF_MEASURE:
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
