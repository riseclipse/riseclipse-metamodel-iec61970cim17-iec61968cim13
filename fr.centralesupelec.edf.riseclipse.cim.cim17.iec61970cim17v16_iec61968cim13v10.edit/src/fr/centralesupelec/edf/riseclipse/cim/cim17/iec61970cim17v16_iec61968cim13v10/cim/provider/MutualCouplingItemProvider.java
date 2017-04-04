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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MutualCoupling;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MutualCoupling} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MutualCouplingItemProvider extends IdentifiedObjectItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MutualCouplingItemProvider( AdapterFactory adapterFactory ) {
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

            addB0chPropertyDescriptor( object );
            addDistance11PropertyDescriptor( object );
            addDistance12PropertyDescriptor( object );
            addDistance21PropertyDescriptor( object );
            addDistance22PropertyDescriptor( object );
            addG0chPropertyDescriptor( object );
            addR0PropertyDescriptor( object );
            addX0PropertyDescriptor( object );
            addSecond_TerminalPropertyDescriptor( object );
            addFirst_TerminalPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the B0ch feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addB0chPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_MutualCoupling_b0ch_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_MutualCoupling_b0ch_feature",
                                "_UI_MutualCoupling_type" ),
                        CimPackage.eINSTANCE.getMutualCoupling_B0ch(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Distance11 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDistance11PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_MutualCoupling_distance11_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_MutualCoupling_distance11_feature",
                                "_UI_MutualCoupling_type" ),
                        CimPackage.eINSTANCE.getMutualCoupling_Distance11(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Distance12 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDistance12PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_MutualCoupling_distance12_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_MutualCoupling_distance12_feature",
                                "_UI_MutualCoupling_type" ),
                        CimPackage.eINSTANCE.getMutualCoupling_Distance12(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Distance21 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDistance21PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_MutualCoupling_distance21_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_MutualCoupling_distance21_feature",
                                "_UI_MutualCoupling_type" ),
                        CimPackage.eINSTANCE.getMutualCoupling_Distance21(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Distance22 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDistance22PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_MutualCoupling_distance22_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_MutualCoupling_distance22_feature",
                                "_UI_MutualCoupling_type" ),
                        CimPackage.eINSTANCE.getMutualCoupling_Distance22(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the G0ch feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addG0chPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_MutualCoupling_g0ch_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_MutualCoupling_g0ch_feature",
                                "_UI_MutualCoupling_type" ),
                        CimPackage.eINSTANCE.getMutualCoupling_G0ch(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the R0 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addR0PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_MutualCoupling_r0_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_MutualCoupling_r0_feature",
                                "_UI_MutualCoupling_type" ),
                        CimPackage.eINSTANCE.getMutualCoupling_R0(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the X0 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addX0PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_MutualCoupling_x0_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_MutualCoupling_x0_feature",
                                "_UI_MutualCoupling_type" ),
                        CimPackage.eINSTANCE.getMutualCoupling_X0(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Second Terminal feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSecond_TerminalPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_MutualCoupling_Second_Terminal_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_MutualCoupling_Second_Terminal_feature",
                                "_UI_MutualCoupling_type" ),
                        CimPackage.eINSTANCE.getMutualCoupling_Second_Terminal(), true, false, true, null, null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the First Terminal feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFirst_TerminalPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_MutualCoupling_First_Terminal_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_MutualCoupling_First_Terminal_feature",
                                "_UI_MutualCoupling_type" ),
                        CimPackage.eINSTANCE.getMutualCoupling_First_Terminal(), true, false, true, null, null,
                        null ) );
    }

    /**
     * This returns MutualCoupling.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/MutualCoupling" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( MutualCoupling ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_MutualCoupling_type" )
                : getString( "_UI_MutualCoupling_type" ) + " " + label;
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

        switch( notification.getFeatureID( MutualCoupling.class ) ) {
        case CimPackage.MUTUAL_COUPLING__B0CH:
        case CimPackage.MUTUAL_COUPLING__DISTANCE11:
        case CimPackage.MUTUAL_COUPLING__DISTANCE12:
        case CimPackage.MUTUAL_COUPLING__DISTANCE21:
        case CimPackage.MUTUAL_COUPLING__DISTANCE22:
        case CimPackage.MUTUAL_COUPLING__G0CH:
        case CimPackage.MUTUAL_COUPLING__R0:
        case CimPackage.MUTUAL_COUPLING__X0:
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
