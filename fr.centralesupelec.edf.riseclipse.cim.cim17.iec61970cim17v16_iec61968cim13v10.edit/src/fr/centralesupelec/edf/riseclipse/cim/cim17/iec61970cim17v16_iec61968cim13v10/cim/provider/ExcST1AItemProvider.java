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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcST1A;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcST1A} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ExcST1AItemProvider extends ExcitationSystemDynamicsItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExcST1AItemProvider( AdapterFactory adapterFactory ) {
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

            addIlrPropertyDescriptor( object );
            addKaPropertyDescriptor( object );
            addKcPropertyDescriptor( object );
            addKfPropertyDescriptor( object );
            addKlrPropertyDescriptor( object );
            addTaPropertyDescriptor( object );
            addTbPropertyDescriptor( object );
            addTb1PropertyDescriptor( object );
            addTcPropertyDescriptor( object );
            addTc1PropertyDescriptor( object );
            addTfPropertyDescriptor( object );
            addVamaxPropertyDescriptor( object );
            addVaminPropertyDescriptor( object );
            addVimaxPropertyDescriptor( object );
            addViminPropertyDescriptor( object );
            addVrmaxPropertyDescriptor( object );
            addVrminPropertyDescriptor( object );
            addXePropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Ilr feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIlrPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcST1A_ilr_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcST1A_ilr_feature",
                                "_UI_ExcST1A_type" ),
                        CimPackage.eINSTANCE.getExcST1A_Ilr(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
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
                        getResourceLocator(), getString( "_UI_ExcST1A_ka_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcST1A_ka_feature", "_UI_ExcST1A_type" ),
                        CimPackage.eINSTANCE.getExcST1A_Ka(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_ExcST1A_kc_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcST1A_kc_feature", "_UI_ExcST1A_type" ),
                        CimPackage.eINSTANCE.getExcST1A_Kc(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Kf feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKfPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcST1A_kf_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcST1A_kf_feature", "_UI_ExcST1A_type" ),
                        CimPackage.eINSTANCE.getExcST1A_Kf(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Klr feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKlrPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcST1A_klr_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcST1A_klr_feature",
                                "_UI_ExcST1A_type" ),
                        CimPackage.eINSTANCE.getExcST1A_Klr(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_ExcST1A_ta_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcST1A_ta_feature", "_UI_ExcST1A_type" ),
                        CimPackage.eINSTANCE.getExcST1A_Ta(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_ExcST1A_tb_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcST1A_tb_feature", "_UI_ExcST1A_type" ),
                        CimPackage.eINSTANCE.getExcST1A_Tb(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tb1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTb1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcST1A_tb1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcST1A_tb1_feature",
                                "_UI_ExcST1A_type" ),
                        CimPackage.eINSTANCE.getExcST1A_Tb1(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_ExcST1A_tc_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcST1A_tc_feature", "_UI_ExcST1A_type" ),
                        CimPackage.eINSTANCE.getExcST1A_Tc(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tc1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTc1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcST1A_tc1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcST1A_tc1_feature",
                                "_UI_ExcST1A_type" ),
                        CimPackage.eINSTANCE.getExcST1A_Tc1(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tf feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTfPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcST1A_tf_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcST1A_tf_feature", "_UI_ExcST1A_type" ),
                        CimPackage.eINSTANCE.getExcST1A_Tf(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Vamax feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVamaxPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcST1A_vamax_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcST1A_vamax_feature",
                                "_UI_ExcST1A_type" ),
                        CimPackage.eINSTANCE.getExcST1A_Vamax(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Vamin feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVaminPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcST1A_vamin_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcST1A_vamin_feature",
                                "_UI_ExcST1A_type" ),
                        CimPackage.eINSTANCE.getExcST1A_Vamin(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_ExcST1A_vimax_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcST1A_vimax_feature",
                                "_UI_ExcST1A_type" ),
                        CimPackage.eINSTANCE.getExcST1A_Vimax(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_ExcST1A_vimin_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcST1A_vimin_feature",
                                "_UI_ExcST1A_type" ),
                        CimPackage.eINSTANCE.getExcST1A_Vimin(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_ExcST1A_vrmax_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcST1A_vrmax_feature",
                                "_UI_ExcST1A_type" ),
                        CimPackage.eINSTANCE.getExcST1A_Vrmax(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_ExcST1A_vrmin_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcST1A_vrmin_feature",
                                "_UI_ExcST1A_type" ),
                        CimPackage.eINSTANCE.getExcST1A_Vrmin(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Xe feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addXePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcST1A_xe_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcST1A_xe_feature", "_UI_ExcST1A_type" ),
                        CimPackage.eINSTANCE.getExcST1A_Xe(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This returns ExcST1A.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/ExcST1A" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( ExcST1A ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_ExcST1A_type" )
                : getString( "_UI_ExcST1A_type" ) + " " + label;
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

        switch( notification.getFeatureID( ExcST1A.class ) ) {
        case CimPackage.EXC_ST1A__ILR:
        case CimPackage.EXC_ST1A__KA:
        case CimPackage.EXC_ST1A__KC:
        case CimPackage.EXC_ST1A__KF:
        case CimPackage.EXC_ST1A__KLR:
        case CimPackage.EXC_ST1A__TA:
        case CimPackage.EXC_ST1A__TB:
        case CimPackage.EXC_ST1A__TB1:
        case CimPackage.EXC_ST1A__TC:
        case CimPackage.EXC_ST1A__TC1:
        case CimPackage.EXC_ST1A__TF:
        case CimPackage.EXC_ST1A__VAMAX:
        case CimPackage.EXC_ST1A__VAMIN:
        case CimPackage.EXC_ST1A__VIMAX:
        case CimPackage.EXC_ST1A__VIMIN:
        case CimPackage.EXC_ST1A__VRMAX:
        case CimPackage.EXC_ST1A__VRMIN:
        case CimPackage.EXC_ST1A__XE:
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
