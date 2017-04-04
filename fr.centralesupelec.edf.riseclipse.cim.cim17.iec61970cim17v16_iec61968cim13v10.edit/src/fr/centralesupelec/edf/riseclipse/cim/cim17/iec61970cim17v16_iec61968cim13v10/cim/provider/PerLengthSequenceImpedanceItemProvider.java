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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PerLengthSequenceImpedance;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PerLengthSequenceImpedance} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PerLengthSequenceImpedanceItemProvider extends PerLengthImpedanceItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PerLengthSequenceImpedanceItemProvider( AdapterFactory adapterFactory ) {
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
            addBchPropertyDescriptor( object );
            addG0chPropertyDescriptor( object );
            addGchPropertyDescriptor( object );
            addRPropertyDescriptor( object );
            addR0PropertyDescriptor( object );
            addXPropertyDescriptor( object );
            addX0PropertyDescriptor( object );
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
                        getResourceLocator(), getString( "_UI_PerLengthSequenceImpedance_b0ch_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PerLengthSequenceImpedance_b0ch_feature",
                                "_UI_PerLengthSequenceImpedance_type" ),
                        CimPackage.eINSTANCE.getPerLengthSequenceImpedance_B0ch(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Bch feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addBchPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PerLengthSequenceImpedance_bch_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PerLengthSequenceImpedance_bch_feature",
                                "_UI_PerLengthSequenceImpedance_type" ),
                        CimPackage.eINSTANCE.getPerLengthSequenceImpedance_Bch(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_PerLengthSequenceImpedance_g0ch_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PerLengthSequenceImpedance_g0ch_feature",
                                "_UI_PerLengthSequenceImpedance_type" ),
                        CimPackage.eINSTANCE.getPerLengthSequenceImpedance_G0ch(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Gch feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addGchPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PerLengthSequenceImpedance_gch_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PerLengthSequenceImpedance_gch_feature",
                                "_UI_PerLengthSequenceImpedance_type" ),
                        CimPackage.eINSTANCE.getPerLengthSequenceImpedance_Gch(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the R feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_PerLengthSequenceImpedance_r_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_PerLengthSequenceImpedance_r_feature",
                        "_UI_PerLengthSequenceImpedance_type" ),
                CimPackage.eINSTANCE.getPerLengthSequenceImpedance_R(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_PerLengthSequenceImpedance_r0_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PerLengthSequenceImpedance_r0_feature",
                                "_UI_PerLengthSequenceImpedance_type" ),
                        CimPackage.eINSTANCE.getPerLengthSequenceImpedance_R0(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the X feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addXPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_PerLengthSequenceImpedance_x_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_PerLengthSequenceImpedance_x_feature",
                        "_UI_PerLengthSequenceImpedance_type" ),
                CimPackage.eINSTANCE.getPerLengthSequenceImpedance_X(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_PerLengthSequenceImpedance_x0_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PerLengthSequenceImpedance_x0_feature",
                                "_UI_PerLengthSequenceImpedance_type" ),
                        CimPackage.eINSTANCE.getPerLengthSequenceImpedance_X0(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This returns PerLengthSequenceImpedance.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/PerLengthSequenceImpedance" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( PerLengthSequenceImpedance ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_PerLengthSequenceImpedance_type" )
                : getString( "_UI_PerLengthSequenceImpedance_type" ) + " " + label;
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

        switch( notification.getFeatureID( PerLengthSequenceImpedance.class ) ) {
        case CimPackage.PER_LENGTH_SEQUENCE_IMPEDANCE__B0CH:
        case CimPackage.PER_LENGTH_SEQUENCE_IMPEDANCE__BCH:
        case CimPackage.PER_LENGTH_SEQUENCE_IMPEDANCE__G0CH:
        case CimPackage.PER_LENGTH_SEQUENCE_IMPEDANCE__GCH:
        case CimPackage.PER_LENGTH_SEQUENCE_IMPEDANCE__R:
        case CimPackage.PER_LENGTH_SEQUENCE_IMPEDANCE__R0:
        case CimPackage.PER_LENGTH_SEQUENCE_IMPEDANCE__X:
        case CimPackage.PER_LENGTH_SEQUENCE_IMPEDANCE__X0:
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
