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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadGenericNonLinear;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadGenericNonLinear} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LoadGenericNonLinearItemProvider extends LoadDynamicsItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LoadGenericNonLinearItemProvider( AdapterFactory adapterFactory ) {
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

            addBsPropertyDescriptor( object );
            addBtPropertyDescriptor( object );
            addGenericNonLinearLoadModelTypePropertyDescriptor( object );
            addLsPropertyDescriptor( object );
            addLtPropertyDescriptor( object );
            addPtPropertyDescriptor( object );
            addQtPropertyDescriptor( object );
            addTpPropertyDescriptor( object );
            addTqPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Bs feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addBsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_LoadGenericNonLinear_bs_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_LoadGenericNonLinear_bs_feature",
                                "_UI_LoadGenericNonLinear_type" ),
                        CimPackage.eINSTANCE.getLoadGenericNonLinear_Bs(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Bt feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addBtPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_LoadGenericNonLinear_bt_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_LoadGenericNonLinear_bt_feature",
                                "_UI_LoadGenericNonLinear_type" ),
                        CimPackage.eINSTANCE.getLoadGenericNonLinear_Bt(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Generic Non Linear Load Model Type feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addGenericNonLinearLoadModelTypePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_LoadGenericNonLinear_genericNonLinearLoadModelType_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_LoadGenericNonLinear_genericNonLinearLoadModelType_feature",
                        "_UI_LoadGenericNonLinear_type" ),
                CimPackage.eINSTANCE.getLoadGenericNonLinear_GenericNonLinearLoadModelType(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Ls feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_LoadGenericNonLinear_ls_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_LoadGenericNonLinear_ls_feature",
                                "_UI_LoadGenericNonLinear_type" ),
                        CimPackage.eINSTANCE.getLoadGenericNonLinear_Ls(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Lt feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLtPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_LoadGenericNonLinear_lt_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_LoadGenericNonLinear_lt_feature",
                                "_UI_LoadGenericNonLinear_type" ),
                        CimPackage.eINSTANCE.getLoadGenericNonLinear_Lt(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Pt feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPtPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_LoadGenericNonLinear_pt_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_LoadGenericNonLinear_pt_feature",
                                "_UI_LoadGenericNonLinear_type" ),
                        CimPackage.eINSTANCE.getLoadGenericNonLinear_Pt(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Qt feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addQtPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_LoadGenericNonLinear_qt_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_LoadGenericNonLinear_qt_feature",
                                "_UI_LoadGenericNonLinear_type" ),
                        CimPackage.eINSTANCE.getLoadGenericNonLinear_Qt(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tp feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTpPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_LoadGenericNonLinear_tp_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_LoadGenericNonLinear_tp_feature",
                                "_UI_LoadGenericNonLinear_type" ),
                        CimPackage.eINSTANCE.getLoadGenericNonLinear_Tp(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tq feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTqPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_LoadGenericNonLinear_tq_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_LoadGenericNonLinear_tq_feature",
                                "_UI_LoadGenericNonLinear_type" ),
                        CimPackage.eINSTANCE.getLoadGenericNonLinear_Tq(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This returns LoadGenericNonLinear.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/LoadGenericNonLinear" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( LoadGenericNonLinear ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_LoadGenericNonLinear_type" )
                : getString( "_UI_LoadGenericNonLinear_type" ) + " " + label;
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

        switch( notification.getFeatureID( LoadGenericNonLinear.class ) ) {
        case CimPackage.LOAD_GENERIC_NON_LINEAR__BS:
        case CimPackage.LOAD_GENERIC_NON_LINEAR__BT:
        case CimPackage.LOAD_GENERIC_NON_LINEAR__GENERIC_NON_LINEAR_LOAD_MODEL_TYPE:
        case CimPackage.LOAD_GENERIC_NON_LINEAR__LS:
        case CimPackage.LOAD_GENERIC_NON_LINEAR__LT:
        case CimPackage.LOAD_GENERIC_NON_LINEAR__PT:
        case CimPackage.LOAD_GENERIC_NON_LINEAR__QT:
        case CimPackage.LOAD_GENERIC_NON_LINEAR__TP:
        case CimPackage.LOAD_GENERIC_NON_LINEAR__TQ:
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
