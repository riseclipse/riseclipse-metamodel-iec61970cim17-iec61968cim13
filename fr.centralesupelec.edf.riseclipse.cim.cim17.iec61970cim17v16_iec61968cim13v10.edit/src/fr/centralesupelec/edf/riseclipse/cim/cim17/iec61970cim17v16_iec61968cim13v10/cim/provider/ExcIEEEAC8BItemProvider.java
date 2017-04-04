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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcIEEEAC8B;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcIEEEAC8B} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ExcIEEEAC8BItemProvider extends ExcitationSystemDynamicsItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExcIEEEAC8BItemProvider( AdapterFactory adapterFactory ) {
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

            addKaPropertyDescriptor( object );
            addKcPropertyDescriptor( object );
            addKdPropertyDescriptor( object );
            addKdrPropertyDescriptor( object );
            addKePropertyDescriptor( object );
            addKirPropertyDescriptor( object );
            addKprPropertyDescriptor( object );
            addSeve1PropertyDescriptor( object );
            addSeve2PropertyDescriptor( object );
            addTaPropertyDescriptor( object );
            addTdrPropertyDescriptor( object );
            addTePropertyDescriptor( object );
            addVe1PropertyDescriptor( object );
            addVe2PropertyDescriptor( object );
            addVeminPropertyDescriptor( object );
            addVfemaxPropertyDescriptor( object );
            addVrmaxPropertyDescriptor( object );
            addVrminPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Ka feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKaPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcIEEEAC8B_ka_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEAC8B_ka_feature",
                                "_UI_ExcIEEEAC8B_type" ),
                        CimPackage.eINSTANCE.getExcIEEEAC8B_Ka(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
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
                        getResourceLocator(), getString( "_UI_ExcIEEEAC8B_kc_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEAC8B_kc_feature",
                                "_UI_ExcIEEEAC8B_type" ),
                        CimPackage.eINSTANCE.getExcIEEEAC8B_Kc(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Kd feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKdPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcIEEEAC8B_kd_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEAC8B_kd_feature",
                                "_UI_ExcIEEEAC8B_type" ),
                        CimPackage.eINSTANCE.getExcIEEEAC8B_Kd(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Kdr feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKdrPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcIEEEAC8B_kdr_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEAC8B_kdr_feature",
                                "_UI_ExcIEEEAC8B_type" ),
                        CimPackage.eINSTANCE.getExcIEEEAC8B_Kdr(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Ke feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcIEEEAC8B_ke_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEAC8B_ke_feature",
                                "_UI_ExcIEEEAC8B_type" ),
                        CimPackage.eINSTANCE.getExcIEEEAC8B_Ke(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_ExcIEEEAC8B_kir_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEAC8B_kir_feature",
                                "_UI_ExcIEEEAC8B_type" ),
                        CimPackage.eINSTANCE.getExcIEEEAC8B_Kir(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_ExcIEEEAC8B_kpr_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEAC8B_kpr_feature",
                                "_UI_ExcIEEEAC8B_type" ),
                        CimPackage.eINSTANCE.getExcIEEEAC8B_Kpr(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Seve1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSeve1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcIEEEAC8B_seve1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEAC8B_seve1_feature",
                                "_UI_ExcIEEEAC8B_type" ),
                        CimPackage.eINSTANCE.getExcIEEEAC8B_Seve1(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Seve2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSeve2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcIEEEAC8B_seve2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEAC8B_seve2_feature",
                                "_UI_ExcIEEEAC8B_type" ),
                        CimPackage.eINSTANCE.getExcIEEEAC8B_Seve2(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_ExcIEEEAC8B_ta_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEAC8B_ta_feature",
                                "_UI_ExcIEEEAC8B_type" ),
                        CimPackage.eINSTANCE.getExcIEEEAC8B_Ta(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tdr feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTdrPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcIEEEAC8B_tdr_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEAC8B_tdr_feature",
                                "_UI_ExcIEEEAC8B_type" ),
                        CimPackage.eINSTANCE.getExcIEEEAC8B_Tdr(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Te feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcIEEEAC8B_te_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEAC8B_te_feature",
                                "_UI_ExcIEEEAC8B_type" ),
                        CimPackage.eINSTANCE.getExcIEEEAC8B_Te(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Ve1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVe1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcIEEEAC8B_ve1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEAC8B_ve1_feature",
                                "_UI_ExcIEEEAC8B_type" ),
                        CimPackage.eINSTANCE.getExcIEEEAC8B_Ve1(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Ve2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVe2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcIEEEAC8B_ve2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEAC8B_ve2_feature",
                                "_UI_ExcIEEEAC8B_type" ),
                        CimPackage.eINSTANCE.getExcIEEEAC8B_Ve2(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Vemin feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVeminPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcIEEEAC8B_vemin_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEAC8B_vemin_feature",
                                "_UI_ExcIEEEAC8B_type" ),
                        CimPackage.eINSTANCE.getExcIEEEAC8B_Vemin(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Vfemax feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVfemaxPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcIEEEAC8B_vfemax_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEAC8B_vfemax_feature",
                                "_UI_ExcIEEEAC8B_type" ),
                        CimPackage.eINSTANCE.getExcIEEEAC8B_Vfemax(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_ExcIEEEAC8B_vrmax_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEAC8B_vrmax_feature",
                                "_UI_ExcIEEEAC8B_type" ),
                        CimPackage.eINSTANCE.getExcIEEEAC8B_Vrmax(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_ExcIEEEAC8B_vrmin_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEAC8B_vrmin_feature",
                                "_UI_ExcIEEEAC8B_type" ),
                        CimPackage.eINSTANCE.getExcIEEEAC8B_Vrmin(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This returns ExcIEEEAC8B.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/ExcIEEEAC8B" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( ExcIEEEAC8B ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_ExcIEEEAC8B_type" )
                : getString( "_UI_ExcIEEEAC8B_type" ) + " " + label;
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

        switch( notification.getFeatureID( ExcIEEEAC8B.class ) ) {
        case CimPackage.EXC_IEEEAC8B__KA:
        case CimPackage.EXC_IEEEAC8B__KC:
        case CimPackage.EXC_IEEEAC8B__KD:
        case CimPackage.EXC_IEEEAC8B__KDR:
        case CimPackage.EXC_IEEEAC8B__KE:
        case CimPackage.EXC_IEEEAC8B__KIR:
        case CimPackage.EXC_IEEEAC8B__KPR:
        case CimPackage.EXC_IEEEAC8B__SEVE1:
        case CimPackage.EXC_IEEEAC8B__SEVE2:
        case CimPackage.EXC_IEEEAC8B__TA:
        case CimPackage.EXC_IEEEAC8B__TDR:
        case CimPackage.EXC_IEEEAC8B__TE:
        case CimPackage.EXC_IEEEAC8B__VE1:
        case CimPackage.EXC_IEEEAC8B__VE2:
        case CimPackage.EXC_IEEEAC8B__VEMIN:
        case CimPackage.EXC_IEEEAC8B__VFEMAX:
        case CimPackage.EXC_IEEEAC8B__VRMAX:
        case CimPackage.EXC_IEEEAC8B__VRMIN:
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
