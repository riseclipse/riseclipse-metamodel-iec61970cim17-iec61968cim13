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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AuxiliaryAgreement;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AuxiliaryAgreement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AuxiliaryAgreementItemProvider extends AgreementItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AuxiliaryAgreementItemProvider( AdapterFactory adapterFactory ) {
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

            addArrearsInterestPropertyDescriptor( object );
            addAuxCyclePropertyDescriptor( object );
            addAuxPriorityCodePropertyDescriptor( object );
            addFixedAmountPropertyDescriptor( object );
            addMinAmountPropertyDescriptor( object );
            addPayCyclePropertyDescriptor( object );
            addSubTypePropertyDescriptor( object );
            addVendPortionPropertyDescriptor( object );
            addVendPortionArrearPropertyDescriptor( object );
            addAuxiliaryAccountsPropertyDescriptor( object );
            addCustomerAgreementPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Arrears Interest feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addArrearsInterestPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_AuxiliaryAgreement_arrearsInterest_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_AuxiliaryAgreement_arrearsInterest_feature",
                        "_UI_AuxiliaryAgreement_type" ),
                CimPackage.eINSTANCE.getAuxiliaryAgreement_ArrearsInterest(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Aux Cycle feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAuxCyclePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_AuxiliaryAgreement_auxCycle_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_AuxiliaryAgreement_auxCycle_feature",
                                "_UI_AuxiliaryAgreement_type" ),
                        CimPackage.eINSTANCE.getAuxiliaryAgreement_AuxCycle(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Aux Priority Code feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAuxPriorityCodePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_AuxiliaryAgreement_auxPriorityCode_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_AuxiliaryAgreement_auxPriorityCode_feature",
                        "_UI_AuxiliaryAgreement_type" ),
                CimPackage.eINSTANCE.getAuxiliaryAgreement_AuxPriorityCode(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Fixed Amount feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFixedAmountPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_AuxiliaryAgreement_fixedAmount_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_AuxiliaryAgreement_fixedAmount_feature",
                        "_UI_AuxiliaryAgreement_type" ),
                CimPackage.eINSTANCE.getAuxiliaryAgreement_FixedAmount(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Min Amount feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMinAmountPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_AuxiliaryAgreement_minAmount_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_AuxiliaryAgreement_minAmount_feature",
                                "_UI_AuxiliaryAgreement_type" ),
                        CimPackage.eINSTANCE.getAuxiliaryAgreement_MinAmount(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Pay Cycle feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPayCyclePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_AuxiliaryAgreement_payCycle_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_AuxiliaryAgreement_payCycle_feature",
                                "_UI_AuxiliaryAgreement_type" ),
                        CimPackage.eINSTANCE.getAuxiliaryAgreement_PayCycle(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Sub Type feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSubTypePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_AuxiliaryAgreement_subType_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_AuxiliaryAgreement_subType_feature",
                                "_UI_AuxiliaryAgreement_type" ),
                        CimPackage.eINSTANCE.getAuxiliaryAgreement_SubType(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Vend Portion feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVendPortionPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_AuxiliaryAgreement_vendPortion_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_AuxiliaryAgreement_vendPortion_feature",
                        "_UI_AuxiliaryAgreement_type" ),
                CimPackage.eINSTANCE.getAuxiliaryAgreement_VendPortion(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Vend Portion Arrear feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVendPortionArrearPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_AuxiliaryAgreement_vendPortionArrear_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_AuxiliaryAgreement_vendPortionArrear_feature",
                        "_UI_AuxiliaryAgreement_type" ),
                CimPackage.eINSTANCE.getAuxiliaryAgreement_VendPortionArrear(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Auxiliary Accounts feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAuxiliaryAccountsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_AuxiliaryAgreement_AuxiliaryAccounts_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_AuxiliaryAgreement_AuxiliaryAccounts_feature",
                        "_UI_AuxiliaryAgreement_type" ),
                CimPackage.eINSTANCE.getAuxiliaryAgreement_AuxiliaryAccounts(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Customer Agreement feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCustomerAgreementPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_AuxiliaryAgreement_CustomerAgreement_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_AuxiliaryAgreement_CustomerAgreement_feature",
                        "_UI_AuxiliaryAgreement_type" ),
                CimPackage.eINSTANCE.getAuxiliaryAgreement_CustomerAgreement(), true, false, true, null, null, null ) );
    }

    /**
     * This returns AuxiliaryAgreement.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/AuxiliaryAgreement" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( AuxiliaryAgreement ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_AuxiliaryAgreement_type" )
                : getString( "_UI_AuxiliaryAgreement_type" ) + " " + label;
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

        switch( notification.getFeatureID( AuxiliaryAgreement.class ) ) {
        case CimPackage.AUXILIARY_AGREEMENT__ARREARS_INTEREST:
        case CimPackage.AUXILIARY_AGREEMENT__AUX_CYCLE:
        case CimPackage.AUXILIARY_AGREEMENT__AUX_PRIORITY_CODE:
        case CimPackage.AUXILIARY_AGREEMENT__FIXED_AMOUNT:
        case CimPackage.AUXILIARY_AGREEMENT__MIN_AMOUNT:
        case CimPackage.AUXILIARY_AGREEMENT__PAY_CYCLE:
        case CimPackage.AUXILIARY_AGREEMENT__SUB_TYPE:
        case CimPackage.AUXILIARY_AGREEMENT__VEND_PORTION:
        case CimPackage.AUXILIARY_AGREEMENT__VEND_PORTION_ARREAR:
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
