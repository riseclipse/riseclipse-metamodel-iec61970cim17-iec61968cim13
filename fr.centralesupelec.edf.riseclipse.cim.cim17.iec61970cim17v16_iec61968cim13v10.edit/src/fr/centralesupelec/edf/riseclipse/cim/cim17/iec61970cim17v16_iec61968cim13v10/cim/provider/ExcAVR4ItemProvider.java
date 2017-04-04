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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcAVR4;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcAVR4} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ExcAVR4ItemProvider extends ExcitationSystemDynamicsItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExcAVR4ItemProvider( AdapterFactory adapterFactory ) {
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

            addImulPropertyDescriptor( object );
            addKaPropertyDescriptor( object );
            addKePropertyDescriptor( object );
            addKifPropertyDescriptor( object );
            addT1PropertyDescriptor( object );
            addT1ifPropertyDescriptor( object );
            addT2PropertyDescriptor( object );
            addT3PropertyDescriptor( object );
            addT4PropertyDescriptor( object );
            addTifPropertyDescriptor( object );
            addVfmnPropertyDescriptor( object );
            addVfmxPropertyDescriptor( object );
            addVrmnPropertyDescriptor( object );
            addVrmxPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Imul feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addImulPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcAVR4_imul_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcAVR4_imul_feature",
                                "_UI_ExcAVR4_type" ),
                        CimPackage.eINSTANCE.getExcAVR4_Imul(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_ExcAVR4_ka_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcAVR4_ka_feature", "_UI_ExcAVR4_type" ),
                        CimPackage.eINSTANCE.getExcAVR4_Ka(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_ExcAVR4_ke_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcAVR4_ke_feature", "_UI_ExcAVR4_type" ),
                        CimPackage.eINSTANCE.getExcAVR4_Ke(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Kif feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKifPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcAVR4_kif_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcAVR4_kif_feature",
                                "_UI_ExcAVR4_type" ),
                        CimPackage.eINSTANCE.getExcAVR4_Kif(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_ExcAVR4_t1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcAVR4_t1_feature", "_UI_ExcAVR4_type" ),
                        CimPackage.eINSTANCE.getExcAVR4_T1(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the T1if feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addT1ifPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcAVR4_t1if_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcAVR4_t1if_feature",
                                "_UI_ExcAVR4_type" ),
                        CimPackage.eINSTANCE.getExcAVR4_T1if(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_ExcAVR4_t2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcAVR4_t2_feature", "_UI_ExcAVR4_type" ),
                        CimPackage.eINSTANCE.getExcAVR4_T2(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_ExcAVR4_t3_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcAVR4_t3_feature", "_UI_ExcAVR4_type" ),
                        CimPackage.eINSTANCE.getExcAVR4_T3(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the T4 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addT4PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcAVR4_t4_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcAVR4_t4_feature", "_UI_ExcAVR4_type" ),
                        CimPackage.eINSTANCE.getExcAVR4_T4(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tif feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTifPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcAVR4_tif_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcAVR4_tif_feature",
                                "_UI_ExcAVR4_type" ),
                        CimPackage.eINSTANCE.getExcAVR4_Tif(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Vfmn feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVfmnPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcAVR4_vfmn_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcAVR4_vfmn_feature",
                                "_UI_ExcAVR4_type" ),
                        CimPackage.eINSTANCE.getExcAVR4_Vfmn(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Vfmx feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVfmxPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcAVR4_vfmx_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcAVR4_vfmx_feature",
                                "_UI_ExcAVR4_type" ),
                        CimPackage.eINSTANCE.getExcAVR4_Vfmx(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_ExcAVR4_vrmn_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcAVR4_vrmn_feature",
                                "_UI_ExcAVR4_type" ),
                        CimPackage.eINSTANCE.getExcAVR4_Vrmn(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_ExcAVR4_vrmx_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcAVR4_vrmx_feature",
                                "_UI_ExcAVR4_type" ),
                        CimPackage.eINSTANCE.getExcAVR4_Vrmx(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This returns ExcAVR4.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/ExcAVR4" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( ExcAVR4 ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_ExcAVR4_type" )
                : getString( "_UI_ExcAVR4_type" ) + " " + label;
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

        switch( notification.getFeatureID( ExcAVR4.class ) ) {
        case CimPackage.EXC_AVR4__IMUL:
        case CimPackage.EXC_AVR4__KA:
        case CimPackage.EXC_AVR4__KE:
        case CimPackage.EXC_AVR4__KIF:
        case CimPackage.EXC_AVR4__T1:
        case CimPackage.EXC_AVR4__T1IF:
        case CimPackage.EXC_AVR4__T2:
        case CimPackage.EXC_AVR4__T3:
        case CimPackage.EXC_AVR4__T4:
        case CimPackage.EXC_AVR4__TIF:
        case CimPackage.EXC_AVR4__VFMN:
        case CimPackage.EXC_AVR4__VFMX:
        case CimPackage.EXC_AVR4__VRMN:
        case CimPackage.EXC_AVR4__VRMX:
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
