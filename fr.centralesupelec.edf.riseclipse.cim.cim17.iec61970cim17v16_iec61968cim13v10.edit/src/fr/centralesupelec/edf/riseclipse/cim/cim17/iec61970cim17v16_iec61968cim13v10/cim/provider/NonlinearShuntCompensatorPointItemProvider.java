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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.NonlinearShuntCompensatorPoint;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.NonlinearShuntCompensatorPoint} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class NonlinearShuntCompensatorPointItemProvider extends CimObjectWithIDItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NonlinearShuntCompensatorPointItemProvider( AdapterFactory adapterFactory ) {
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

            addBPropertyDescriptor( object );
            addB0PropertyDescriptor( object );
            addGPropertyDescriptor( object );
            addG0PropertyDescriptor( object );
            addSectionNumberPropertyDescriptor( object );
            addNonlinearShuntCompensatorPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the B feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addBPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_NonlinearShuntCompensatorPoint_b_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_NonlinearShuntCompensatorPoint_b_feature",
                                "_UI_NonlinearShuntCompensatorPoint_type" ),
                        CimPackage.eINSTANCE.getNonlinearShuntCompensatorPoint_B(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the B0 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addB0PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_NonlinearShuntCompensatorPoint_b0_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_NonlinearShuntCompensatorPoint_b0_feature",
                        "_UI_NonlinearShuntCompensatorPoint_type" ),
                CimPackage.eINSTANCE.getNonlinearShuntCompensatorPoint_B0(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the G feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addGPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_NonlinearShuntCompensatorPoint_g_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_NonlinearShuntCompensatorPoint_g_feature",
                                "_UI_NonlinearShuntCompensatorPoint_type" ),
                        CimPackage.eINSTANCE.getNonlinearShuntCompensatorPoint_G(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the G0 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addG0PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_NonlinearShuntCompensatorPoint_g0_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_NonlinearShuntCompensatorPoint_g0_feature",
                        "_UI_NonlinearShuntCompensatorPoint_type" ),
                CimPackage.eINSTANCE.getNonlinearShuntCompensatorPoint_G0(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Section Number feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSectionNumberPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_NonlinearShuntCompensatorPoint_sectionNumber_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_NonlinearShuntCompensatorPoint_sectionNumber_feature",
                                "_UI_NonlinearShuntCompensatorPoint_type" ),
                        CimPackage.eINSTANCE.getNonlinearShuntCompensatorPoint_SectionNumber(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Nonlinear Shunt Compensator feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addNonlinearShuntCompensatorPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_NonlinearShuntCompensatorPoint_NonlinearShuntCompensator_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_NonlinearShuntCompensatorPoint_NonlinearShuntCompensator_feature",
                        "_UI_NonlinearShuntCompensatorPoint_type" ),
                CimPackage.eINSTANCE.getNonlinearShuntCompensatorPoint_NonlinearShuntCompensator(), true, false, true,
                null, null, null ) );
    }

    /**
     * This returns NonlinearShuntCompensatorPoint.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/NonlinearShuntCompensatorPoint" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( NonlinearShuntCompensatorPoint ) object ).getID();
        return label == null || label.length() == 0 ? getString( "_UI_NonlinearShuntCompensatorPoint_type" )
                : getString( "_UI_NonlinearShuntCompensatorPoint_type" ) + " " + label;
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

        switch( notification.getFeatureID( NonlinearShuntCompensatorPoint.class ) ) {
        case CimPackage.NONLINEAR_SHUNT_COMPENSATOR_POINT__B:
        case CimPackage.NONLINEAR_SHUNT_COMPENSATOR_POINT__B0:
        case CimPackage.NONLINEAR_SHUNT_COMPENSATOR_POINT__G:
        case CimPackage.NONLINEAR_SHUNT_COMPENSATOR_POINT__G0:
        case CimPackage.NONLINEAR_SHUNT_COMPENSATOR_POINT__SECTION_NUMBER:
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
