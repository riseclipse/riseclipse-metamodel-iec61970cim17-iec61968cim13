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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OverexcLimX2;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OverexcLimX2} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OverexcLimX2ItemProvider extends OverexcitationLimiterDynamicsItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OverexcLimX2ItemProvider( AdapterFactory adapterFactory ) {
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

            addEfd1PropertyDescriptor( object );
            addEfd2PropertyDescriptor( object );
            addEfd3PropertyDescriptor( object );
            addEfddesPropertyDescriptor( object );
            addEfdratedPropertyDescriptor( object );
            addKmxPropertyDescriptor( object );
            addMPropertyDescriptor( object );
            addT1PropertyDescriptor( object );
            addT2PropertyDescriptor( object );
            addT3PropertyDescriptor( object );
            addVlowPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Efd1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEfd1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_OverexcLimX2_efd1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_OverexcLimX2_efd1_feature",
                                "_UI_OverexcLimX2_type" ),
                        CimPackage.eINSTANCE.getOverexcLimX2_Efd1(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Efd2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEfd2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_OverexcLimX2_efd2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_OverexcLimX2_efd2_feature",
                                "_UI_OverexcLimX2_type" ),
                        CimPackage.eINSTANCE.getOverexcLimX2_Efd2(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Efd3 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEfd3PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_OverexcLimX2_efd3_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_OverexcLimX2_efd3_feature",
                                "_UI_OverexcLimX2_type" ),
                        CimPackage.eINSTANCE.getOverexcLimX2_Efd3(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Efddes feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEfddesPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_OverexcLimX2_efddes_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_OverexcLimX2_efddes_feature",
                                "_UI_OverexcLimX2_type" ),
                        CimPackage.eINSTANCE.getOverexcLimX2_Efddes(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Efdrated feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEfdratedPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_OverexcLimX2_efdrated_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_OverexcLimX2_efdrated_feature",
                                "_UI_OverexcLimX2_type" ),
                        CimPackage.eINSTANCE.getOverexcLimX2_Efdrated(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Kmx feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKmxPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_OverexcLimX2_kmx_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_OverexcLimX2_kmx_feature",
                                "_UI_OverexcLimX2_type" ),
                        CimPackage.eINSTANCE.getOverexcLimX2_Kmx(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the M feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_OverexcLimX2_m_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_OverexcLimX2_m_feature",
                                "_UI_OverexcLimX2_type" ),
                        CimPackage.eINSTANCE.getOverexcLimX2_M(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_OverexcLimX2_t1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_OverexcLimX2_t1_feature",
                                "_UI_OverexcLimX2_type" ),
                        CimPackage.eINSTANCE.getOverexcLimX2_T1(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_OverexcLimX2_t2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_OverexcLimX2_t2_feature",
                                "_UI_OverexcLimX2_type" ),
                        CimPackage.eINSTANCE.getOverexcLimX2_T2(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_OverexcLimX2_t3_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_OverexcLimX2_t3_feature",
                                "_UI_OverexcLimX2_type" ),
                        CimPackage.eINSTANCE.getOverexcLimX2_T3(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Vlow feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVlowPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_OverexcLimX2_vlow_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_OverexcLimX2_vlow_feature",
                                "_UI_OverexcLimX2_type" ),
                        CimPackage.eINSTANCE.getOverexcLimX2_Vlow(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This returns OverexcLimX2.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/OverexcLimX2" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( OverexcLimX2 ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_OverexcLimX2_type" )
                : getString( "_UI_OverexcLimX2_type" ) + " " + label;
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

        switch( notification.getFeatureID( OverexcLimX2.class ) ) {
        case CimPackage.OVEREXC_LIM_X2__EFD1:
        case CimPackage.OVEREXC_LIM_X2__EFD2:
        case CimPackage.OVEREXC_LIM_X2__EFD3:
        case CimPackage.OVEREXC_LIM_X2__EFDDES:
        case CimPackage.OVEREXC_LIM_X2__EFDRATED:
        case CimPackage.OVEREXC_LIM_X2__KMX:
        case CimPackage.OVEREXC_LIM_X2__M:
        case CimPackage.OVEREXC_LIM_X2__T1:
        case CimPackage.OVEREXC_LIM_X2__T2:
        case CimPackage.OVEREXC_LIM_X2__T3:
        case CimPackage.OVEREXC_LIM_X2__VLOW:
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
