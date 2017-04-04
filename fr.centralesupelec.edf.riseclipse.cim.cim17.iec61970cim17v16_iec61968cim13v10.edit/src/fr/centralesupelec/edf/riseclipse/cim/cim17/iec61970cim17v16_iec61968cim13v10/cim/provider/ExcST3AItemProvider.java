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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcST3A;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcST3A} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ExcST3AItemProvider extends ExcitationSystemDynamicsItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExcST3AItemProvider( AdapterFactory adapterFactory ) {
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

            addEfdmaxPropertyDescriptor( object );
            addKcPropertyDescriptor( object );
            addKgPropertyDescriptor( object );
            addKiPropertyDescriptor( object );
            addKjPropertyDescriptor( object );
            addKmPropertyDescriptor( object );
            addKpPropertyDescriptor( object );
            addKsPropertyDescriptor( object );
            addKs1PropertyDescriptor( object );
            addTbPropertyDescriptor( object );
            addTcPropertyDescriptor( object );
            addThetapPropertyDescriptor( object );
            addTmPropertyDescriptor( object );
            addVbmaxPropertyDescriptor( object );
            addVgmaxPropertyDescriptor( object );
            addVimaxPropertyDescriptor( object );
            addViminPropertyDescriptor( object );
            addVrmaxPropertyDescriptor( object );
            addVrminPropertyDescriptor( object );
            addXlPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Efdmax feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEfdmaxPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcST3A_efdmax_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcST3A_efdmax_feature",
                                "_UI_ExcST3A_type" ),
                        CimPackage.eINSTANCE.getExcST3A_Efdmax(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_ExcST3A_kc_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcST3A_kc_feature", "_UI_ExcST3A_type" ),
                        CimPackage.eINSTANCE.getExcST3A_Kc(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_ExcST3A_kg_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcST3A_kg_feature", "_UI_ExcST3A_type" ),
                        CimPackage.eINSTANCE.getExcST3A_Kg(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_ExcST3A_ki_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcST3A_ki_feature", "_UI_ExcST3A_type" ),
                        CimPackage.eINSTANCE.getExcST3A_Ki(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Kj feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKjPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcST3A_kj_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcST3A_kj_feature", "_UI_ExcST3A_type" ),
                        CimPackage.eINSTANCE.getExcST3A_Kj(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Km feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKmPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcST3A_km_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcST3A_km_feature", "_UI_ExcST3A_type" ),
                        CimPackage.eINSTANCE.getExcST3A_Km(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_ExcST3A_kp_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcST3A_kp_feature", "_UI_ExcST3A_type" ),
                        CimPackage.eINSTANCE.getExcST3A_Kp(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Ks feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcST3A_ks_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcST3A_ks_feature", "_UI_ExcST3A_type" ),
                        CimPackage.eINSTANCE.getExcST3A_Ks(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_ExcST3A_ks1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcST3A_ks1_feature",
                                "_UI_ExcST3A_type" ),
                        CimPackage.eINSTANCE.getExcST3A_Ks1(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tb feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTbPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcST3A_tb_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcST3A_tb_feature", "_UI_ExcST3A_type" ),
                        CimPackage.eINSTANCE.getExcST3A_Tb(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tc feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTcPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcST3A_tc_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcST3A_tc_feature", "_UI_ExcST3A_type" ),
                        CimPackage.eINSTANCE.getExcST3A_Tc(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_ExcST3A_thetap_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcST3A_thetap_feature",
                                "_UI_ExcST3A_type" ),
                        CimPackage.eINSTANCE.getExcST3A_Thetap(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tm feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTmPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcST3A_tm_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcST3A_tm_feature", "_UI_ExcST3A_type" ),
                        CimPackage.eINSTANCE.getExcST3A_Tm(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_ExcST3A_vbmax_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcST3A_vbmax_feature",
                                "_UI_ExcST3A_type" ),
                        CimPackage.eINSTANCE.getExcST3A_Vbmax(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Vgmax feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVgmaxPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcST3A_vgmax_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcST3A_vgmax_feature",
                                "_UI_ExcST3A_type" ),
                        CimPackage.eINSTANCE.getExcST3A_Vgmax(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Vimax feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVimaxPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcST3A_vimax_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcST3A_vimax_feature",
                                "_UI_ExcST3A_type" ),
                        CimPackage.eINSTANCE.getExcST3A_Vimax(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Vimin feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addViminPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcST3A_vimin_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcST3A_vimin_feature",
                                "_UI_ExcST3A_type" ),
                        CimPackage.eINSTANCE.getExcST3A_Vimin(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_ExcST3A_vrmax_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcST3A_vrmax_feature",
                                "_UI_ExcST3A_type" ),
                        CimPackage.eINSTANCE.getExcST3A_Vrmax(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_ExcST3A_vrmin_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcST3A_vrmin_feature",
                                "_UI_ExcST3A_type" ),
                        CimPackage.eINSTANCE.getExcST3A_Vrmin(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_ExcST3A_xl_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcST3A_xl_feature", "_UI_ExcST3A_type" ),
                        CimPackage.eINSTANCE.getExcST3A_Xl(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This returns ExcST3A.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/ExcST3A" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( ExcST3A ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_ExcST3A_type" )
                : getString( "_UI_ExcST3A_type" ) + " " + label;
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

        switch( notification.getFeatureID( ExcST3A.class ) ) {
        case CimPackage.EXC_ST3A__EFDMAX:
        case CimPackage.EXC_ST3A__KC:
        case CimPackage.EXC_ST3A__KG:
        case CimPackage.EXC_ST3A__KI:
        case CimPackage.EXC_ST3A__KJ:
        case CimPackage.EXC_ST3A__KM:
        case CimPackage.EXC_ST3A__KP:
        case CimPackage.EXC_ST3A__KS:
        case CimPackage.EXC_ST3A__KS1:
        case CimPackage.EXC_ST3A__TB:
        case CimPackage.EXC_ST3A__TC:
        case CimPackage.EXC_ST3A__THETAP:
        case CimPackage.EXC_ST3A__TM:
        case CimPackage.EXC_ST3A__VBMAX:
        case CimPackage.EXC_ST3A__VGMAX:
        case CimPackage.EXC_ST3A__VIMAX:
        case CimPackage.EXC_ST3A__VIMIN:
        case CimPackage.EXC_ST3A__VRMAX:
        case CimPackage.EXC_ST3A__VRMIN:
        case CimPackage.EXC_ST3A__XL:
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
