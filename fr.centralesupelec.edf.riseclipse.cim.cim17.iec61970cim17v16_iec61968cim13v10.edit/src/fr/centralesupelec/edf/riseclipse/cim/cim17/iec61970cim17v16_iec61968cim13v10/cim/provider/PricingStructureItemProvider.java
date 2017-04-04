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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PricingStructure;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PricingStructure} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PricingStructureItemProvider extends DocumentItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PricingStructureItemProvider( AdapterFactory adapterFactory ) {
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

            addCodePropertyDescriptor( object );
            addDailyCeilingUsagePropertyDescriptor( object );
            addDailyEstimatedUsagePropertyDescriptor( object );
            addDailyFloorUsagePropertyDescriptor( object );
            addRevenueKindPropertyDescriptor( object );
            addTaxExemptionPropertyDescriptor( object );
            addUsagePointsPropertyDescriptor( object );
            addServiceCategoryPropertyDescriptor( object );
            addTariffsPropertyDescriptor( object );
            addCustomerAgreementsPropertyDescriptor( object );
            addTransactionsPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Code feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCodePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PricingStructure_code_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PricingStructure_code_feature",
                                "_UI_PricingStructure_type" ),
                        CimPackage.eINSTANCE.getPricingStructure_Code(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Daily Ceiling Usage feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDailyCeilingUsagePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_PricingStructure_dailyCeilingUsage_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_PricingStructure_dailyCeilingUsage_feature",
                        "_UI_PricingStructure_type" ),
                CimPackage.eINSTANCE.getPricingStructure_DailyCeilingUsage(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Daily Estimated Usage feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDailyEstimatedUsagePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_PricingStructure_dailyEstimatedUsage_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_PricingStructure_dailyEstimatedUsage_feature",
                        "_UI_PricingStructure_type" ),
                CimPackage.eINSTANCE.getPricingStructure_DailyEstimatedUsage(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Daily Floor Usage feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDailyFloorUsagePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_PricingStructure_dailyFloorUsage_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_PricingStructure_dailyFloorUsage_feature",
                        "_UI_PricingStructure_type" ),
                CimPackage.eINSTANCE.getPricingStructure_DailyFloorUsage(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Revenue Kind feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRevenueKindPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PricingStructure_revenueKind_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PricingStructure_revenueKind_feature",
                                "_UI_PricingStructure_type" ),
                        CimPackage.eINSTANCE.getPricingStructure_RevenueKind(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tax Exemption feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTaxExemptionPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PricingStructure_taxExemption_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PricingStructure_taxExemption_feature",
                                "_UI_PricingStructure_type" ),
                        CimPackage.eINSTANCE.getPricingStructure_TaxExemption(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Usage Points feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUsagePointsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PricingStructure_UsagePoints_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PricingStructure_UsagePoints_feature",
                                "_UI_PricingStructure_type" ),
                        CimPackage.eINSTANCE.getPricingStructure_UsagePoints(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Service Category feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addServiceCategoryPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_PricingStructure_ServiceCategory_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_PricingStructure_ServiceCategory_feature",
                        "_UI_PricingStructure_type" ),
                CimPackage.eINSTANCE.getPricingStructure_ServiceCategory(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tariffs feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTariffsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PricingStructure_Tariffs_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PricingStructure_Tariffs_feature",
                                "_UI_PricingStructure_type" ),
                        CimPackage.eINSTANCE.getPricingStructure_Tariffs(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Customer Agreements feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCustomerAgreementsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_PricingStructure_CustomerAgreements_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_PricingStructure_CustomerAgreements_feature",
                        "_UI_PricingStructure_type" ),
                CimPackage.eINSTANCE.getPricingStructure_CustomerAgreements(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Transactions feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTransactionsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PricingStructure_Transactions_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PricingStructure_Transactions_feature",
                                "_UI_PricingStructure_type" ),
                        CimPackage.eINSTANCE.getPricingStructure_Transactions(), true, false, true, null, null,
                        null ) );
    }

    /**
     * This returns PricingStructure.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/PricingStructure" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( PricingStructure ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_PricingStructure_type" )
                : getString( "_UI_PricingStructure_type" ) + " " + label;
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

        switch( notification.getFeatureID( PricingStructure.class ) ) {
        case CimPackage.PRICING_STRUCTURE__CODE:
        case CimPackage.PRICING_STRUCTURE__DAILY_CEILING_USAGE:
        case CimPackage.PRICING_STRUCTURE__DAILY_ESTIMATED_USAGE:
        case CimPackage.PRICING_STRUCTURE__DAILY_FLOOR_USAGE:
        case CimPackage.PRICING_STRUCTURE__REVENUE_KIND:
        case CimPackage.PRICING_STRUCTURE__TAX_EXEMPTION:
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

    /**
     * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getCreateChildText( Object owner, Object feature, Object child, Collection< ? > selection ) {
        Object childFeature = feature;
        Object childObject = child;

        boolean qualify = childFeature == CimPackage.eINSTANCE.getDocument_DocStatus()
                || childFeature == CimPackage.eINSTANCE.getDocument_Status();

        if( qualify ) {
            return getString( "_UI_CreateChild_text2",
                    new Object[] { getTypeText( childObject ), getFeatureText( childFeature ), getTypeText( owner ) } );
        }
        return super.getCreateChildText( owner, feature, child, selection );
    }

}
