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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PssELIN2;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PssELIN2} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PssELIN2ItemProvider extends PowerSystemStabilizerDynamicsItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PssELIN2ItemProvider( AdapterFactory adapterFactory ) {
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

            addApssPropertyDescriptor( object );
            addKs1PropertyDescriptor( object );
            addKs2PropertyDescriptor( object );
            addPpssPropertyDescriptor( object );
            addPsslimPropertyDescriptor( object );
            addTs1PropertyDescriptor( object );
            addTs2PropertyDescriptor( object );
            addTs3PropertyDescriptor( object );
            addTs4PropertyDescriptor( object );
            addTs5PropertyDescriptor( object );
            addTs6PropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Apss feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addApssPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssELIN2_apss_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssELIN2_apss_feature",
                                "_UI_PssELIN2_type" ),
                        CimPackage.eINSTANCE.getPssELIN2_Apss(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Ks1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKs1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssELIN2_ks1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssELIN2_ks1_feature",
                                "_UI_PssELIN2_type" ),
                        CimPackage.eINSTANCE.getPssELIN2_Ks1(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Ks2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKs2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssELIN2_ks2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssELIN2_ks2_feature",
                                "_UI_PssELIN2_type" ),
                        CimPackage.eINSTANCE.getPssELIN2_Ks2(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Ppss feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPpssPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssELIN2_ppss_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssELIN2_ppss_feature",
                                "_UI_PssELIN2_type" ),
                        CimPackage.eINSTANCE.getPssELIN2_Ppss(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Psslim feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPsslimPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssELIN2_psslim_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssELIN2_psslim_feature",
                                "_UI_PssELIN2_type" ),
                        CimPackage.eINSTANCE.getPssELIN2_Psslim(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Ts1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTs1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssELIN2_ts1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssELIN2_ts1_feature",
                                "_UI_PssELIN2_type" ),
                        CimPackage.eINSTANCE.getPssELIN2_Ts1(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Ts2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTs2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssELIN2_ts2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssELIN2_ts2_feature",
                                "_UI_PssELIN2_type" ),
                        CimPackage.eINSTANCE.getPssELIN2_Ts2(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Ts3 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTs3PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssELIN2_ts3_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssELIN2_ts3_feature",
                                "_UI_PssELIN2_type" ),
                        CimPackage.eINSTANCE.getPssELIN2_Ts3(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Ts4 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTs4PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssELIN2_ts4_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssELIN2_ts4_feature",
                                "_UI_PssELIN2_type" ),
                        CimPackage.eINSTANCE.getPssELIN2_Ts4(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Ts5 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTs5PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssELIN2_ts5_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssELIN2_ts5_feature",
                                "_UI_PssELIN2_type" ),
                        CimPackage.eINSTANCE.getPssELIN2_Ts5(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Ts6 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTs6PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssELIN2_ts6_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssELIN2_ts6_feature",
                                "_UI_PssELIN2_type" ),
                        CimPackage.eINSTANCE.getPssELIN2_Ts6(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This returns PssELIN2.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/PssELIN2" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( PssELIN2 ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_PssELIN2_type" )
                : getString( "_UI_PssELIN2_type" ) + " " + label;
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

        switch( notification.getFeatureID( PssELIN2.class ) ) {
        case CimPackage.PSS_ELIN2__APSS:
        case CimPackage.PSS_ELIN2__KS1:
        case CimPackage.PSS_ELIN2__KS2:
        case CimPackage.PSS_ELIN2__PPSS:
        case CimPackage.PSS_ELIN2__PSSLIM:
        case CimPackage.PSS_ELIN2__TS1:
        case CimPackage.PSS_ELIN2__TS2:
        case CimPackage.PSS_ELIN2__TS3:
        case CimPackage.PSS_ELIN2__TS4:
        case CimPackage.PSS_ELIN2__TS5:
        case CimPackage.PSS_ELIN2__TS6:
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
