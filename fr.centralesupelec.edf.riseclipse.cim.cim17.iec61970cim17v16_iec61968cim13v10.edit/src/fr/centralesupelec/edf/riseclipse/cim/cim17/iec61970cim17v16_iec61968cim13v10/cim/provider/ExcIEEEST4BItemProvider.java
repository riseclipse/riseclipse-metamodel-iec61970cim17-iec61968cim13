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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcIEEEST4B;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcIEEEST4B} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ExcIEEEST4BItemProvider extends ExcitationSystemDynamicsItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExcIEEEST4BItemProvider( AdapterFactory adapterFactory ) {
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

            addKcPropertyDescriptor( object );
            addKgPropertyDescriptor( object );
            addKiPropertyDescriptor( object );
            addKimPropertyDescriptor( object );
            addKirPropertyDescriptor( object );
            addKpPropertyDescriptor( object );
            addKpmPropertyDescriptor( object );
            addKprPropertyDescriptor( object );
            addTaPropertyDescriptor( object );
            addThetapPropertyDescriptor( object );
            addVbmaxPropertyDescriptor( object );
            addVmmaxPropertyDescriptor( object );
            addVmminPropertyDescriptor( object );
            addVrmaxPropertyDescriptor( object );
            addVrminPropertyDescriptor( object );
            addXlPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Kc feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKcPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcIEEEST4B_kc_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEST4B_kc_feature",
                                "_UI_ExcIEEEST4B_type" ),
                        CimPackage.eINSTANCE.getExcIEEEST4B_Kc(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Kg feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKgPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcIEEEST4B_kg_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEST4B_kg_feature",
                                "_UI_ExcIEEEST4B_type" ),
                        CimPackage.eINSTANCE.getExcIEEEST4B_Kg(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Ki feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKiPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcIEEEST4B_ki_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEST4B_ki_feature",
                                "_UI_ExcIEEEST4B_type" ),
                        CimPackage.eINSTANCE.getExcIEEEST4B_Ki(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Kim feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKimPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcIEEEST4B_kim_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEST4B_kim_feature",
                                "_UI_ExcIEEEST4B_type" ),
                        CimPackage.eINSTANCE.getExcIEEEST4B_Kim(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Kir feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKirPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcIEEEST4B_kir_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEST4B_kir_feature",
                                "_UI_ExcIEEEST4B_type" ),
                        CimPackage.eINSTANCE.getExcIEEEST4B_Kir(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Kp feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKpPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcIEEEST4B_kp_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEST4B_kp_feature",
                                "_UI_ExcIEEEST4B_type" ),
                        CimPackage.eINSTANCE.getExcIEEEST4B_Kp(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Kpm feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKpmPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcIEEEST4B_kpm_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEST4B_kpm_feature",
                                "_UI_ExcIEEEST4B_type" ),
                        CimPackage.eINSTANCE.getExcIEEEST4B_Kpm(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Kpr feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKprPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcIEEEST4B_kpr_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEST4B_kpr_feature",
                                "_UI_ExcIEEEST4B_type" ),
                        CimPackage.eINSTANCE.getExcIEEEST4B_Kpr(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Ta feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTaPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcIEEEST4B_ta_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEST4B_ta_feature",
                                "_UI_ExcIEEEST4B_type" ),
                        CimPackage.eINSTANCE.getExcIEEEST4B_Ta(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Thetap feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addThetapPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcIEEEST4B_thetap_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEST4B_thetap_feature",
                                "_UI_ExcIEEEST4B_type" ),
                        CimPackage.eINSTANCE.getExcIEEEST4B_Thetap(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Vbmax feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVbmaxPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcIEEEST4B_vbmax_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEST4B_vbmax_feature",
                                "_UI_ExcIEEEST4B_type" ),
                        CimPackage.eINSTANCE.getExcIEEEST4B_Vbmax(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Vmmax feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVmmaxPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcIEEEST4B_vmmax_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEST4B_vmmax_feature",
                                "_UI_ExcIEEEST4B_type" ),
                        CimPackage.eINSTANCE.getExcIEEEST4B_Vmmax(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Vmmin feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVmminPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcIEEEST4B_vmmin_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEST4B_vmmin_feature",
                                "_UI_ExcIEEEST4B_type" ),
                        CimPackage.eINSTANCE.getExcIEEEST4B_Vmmin(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Vrmax feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVrmaxPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcIEEEST4B_vrmax_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEST4B_vrmax_feature",
                                "_UI_ExcIEEEST4B_type" ),
                        CimPackage.eINSTANCE.getExcIEEEST4B_Vrmax(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Vrmin feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVrminPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcIEEEST4B_vrmin_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEST4B_vrmin_feature",
                                "_UI_ExcIEEEST4B_type" ),
                        CimPackage.eINSTANCE.getExcIEEEST4B_Vrmin(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Xl feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addXlPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcIEEEST4B_xl_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEST4B_xl_feature",
                                "_UI_ExcIEEEST4B_type" ),
                        CimPackage.eINSTANCE.getExcIEEEST4B_Xl(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This returns ExcIEEEST4B.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/ExcIEEEST4B" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( ExcIEEEST4B ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_ExcIEEEST4B_type" )
                : getString( "_UI_ExcIEEEST4B_type" ) + " " + label;
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

        switch( notification.getFeatureID( ExcIEEEST4B.class ) ) {
        case CimPackage.EXC_IEEEST4B__KC:
        case CimPackage.EXC_IEEEST4B__KG:
        case CimPackage.EXC_IEEEST4B__KI:
        case CimPackage.EXC_IEEEST4B__KIM:
        case CimPackage.EXC_IEEEST4B__KIR:
        case CimPackage.EXC_IEEEST4B__KP:
        case CimPackage.EXC_IEEEST4B__KPM:
        case CimPackage.EXC_IEEEST4B__KPR:
        case CimPackage.EXC_IEEEST4B__TA:
        case CimPackage.EXC_IEEEST4B__THETAP:
        case CimPackage.EXC_IEEEST4B__VBMAX:
        case CimPackage.EXC_IEEEST4B__VMMAX:
        case CimPackage.EXC_IEEEST4B__VMMIN:
        case CimPackage.EXC_IEEEST4B__VRMAX:
        case CimPackage.EXC_IEEEST4B__VRMIN:
        case CimPackage.EXC_IEEEST4B__XL:
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
