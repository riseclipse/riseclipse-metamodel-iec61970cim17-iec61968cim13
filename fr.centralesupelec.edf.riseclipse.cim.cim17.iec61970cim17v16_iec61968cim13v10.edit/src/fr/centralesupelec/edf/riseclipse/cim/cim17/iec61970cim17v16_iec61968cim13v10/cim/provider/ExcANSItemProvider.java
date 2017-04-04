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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcANS;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcANS} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ExcANSItemProvider extends ExcitationSystemDynamicsItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExcANSItemProvider( AdapterFactory adapterFactory ) {
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

            addBlintPropertyDescriptor( object );
            addIfmnPropertyDescriptor( object );
            addIfmxPropertyDescriptor( object );
            addK2PropertyDescriptor( object );
            addK3PropertyDescriptor( object );
            addKcePropertyDescriptor( object );
            addKrveccPropertyDescriptor( object );
            addKvfifPropertyDescriptor( object );
            addT1PropertyDescriptor( object );
            addT2PropertyDescriptor( object );
            addT3PropertyDescriptor( object );
            addTbPropertyDescriptor( object );
            addVrmnPropertyDescriptor( object );
            addVrmxPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Blint feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addBlintPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcANS_blint_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcANS_blint_feature",
                                "_UI_ExcANS_type" ),
                        CimPackage.eINSTANCE.getExcANS_Blint(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Ifmn feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIfmnPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcANS_ifmn_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcANS_ifmn_feature", "_UI_ExcANS_type" ),
                        CimPackage.eINSTANCE.getExcANS_Ifmn(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Ifmx feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIfmxPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcANS_ifmx_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcANS_ifmx_feature", "_UI_ExcANS_type" ),
                        CimPackage.eINSTANCE.getExcANS_Ifmx(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the K2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addK2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcANS_k2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcANS_k2_feature", "_UI_ExcANS_type" ),
                        CimPackage.eINSTANCE.getExcANS_K2(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the K3 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addK3PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcANS_k3_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcANS_k3_feature", "_UI_ExcANS_type" ),
                        CimPackage.eINSTANCE.getExcANS_K3(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Kce feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKcePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcANS_kce_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcANS_kce_feature", "_UI_ExcANS_type" ),
                        CimPackage.eINSTANCE.getExcANS_Kce(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Krvecc feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKrveccPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcANS_krvecc_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcANS_krvecc_feature",
                                "_UI_ExcANS_type" ),
                        CimPackage.eINSTANCE.getExcANS_Krvecc(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Kvfif feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKvfifPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcANS_kvfif_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcANS_kvfif_feature",
                                "_UI_ExcANS_type" ),
                        CimPackage.eINSTANCE.getExcANS_Kvfif(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the T1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addT1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcANS_t1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcANS_t1_feature", "_UI_ExcANS_type" ),
                        CimPackage.eINSTANCE.getExcANS_T1(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the T2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addT2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcANS_t2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcANS_t2_feature", "_UI_ExcANS_type" ),
                        CimPackage.eINSTANCE.getExcANS_T2(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the T3 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addT3PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcANS_t3_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcANS_t3_feature", "_UI_ExcANS_type" ),
                        CimPackage.eINSTANCE.getExcANS_T3(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_ExcANS_tb_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcANS_tb_feature", "_UI_ExcANS_type" ),
                        CimPackage.eINSTANCE.getExcANS_Tb(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Vrmn feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVrmnPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcANS_vrmn_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcANS_vrmn_feature", "_UI_ExcANS_type" ),
                        CimPackage.eINSTANCE.getExcANS_Vrmn(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Vrmx feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVrmxPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcANS_vrmx_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcANS_vrmx_feature", "_UI_ExcANS_type" ),
                        CimPackage.eINSTANCE.getExcANS_Vrmx(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This returns ExcANS.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/ExcANS" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( ExcANS ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_ExcANS_type" )
                : getString( "_UI_ExcANS_type" ) + " " + label;
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

        switch( notification.getFeatureID( ExcANS.class ) ) {
        case CimPackage.EXC_ANS__BLINT:
        case CimPackage.EXC_ANS__IFMN:
        case CimPackage.EXC_ANS__IFMX:
        case CimPackage.EXC_ANS__K2:
        case CimPackage.EXC_ANS__K3:
        case CimPackage.EXC_ANS__KCE:
        case CimPackage.EXC_ANS__KRVECC:
        case CimPackage.EXC_ANS__KVFIF:
        case CimPackage.EXC_ANS__T1:
        case CimPackage.EXC_ANS__T2:
        case CimPackage.EXC_ANS__T3:
        case CimPackage.EXC_ANS__TB:
        case CimPackage.EXC_ANS__VRMN:
        case CimPackage.EXC_ANS__VRMX:
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
