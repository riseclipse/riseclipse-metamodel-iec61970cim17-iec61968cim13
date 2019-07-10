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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PendingCalculation;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PendingCalculation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PendingCalculationItemProvider extends CimObjectWithIDItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PendingCalculationItemProvider( AdapterFactory adapterFactory ) {
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

            addMultiplyBeforeAddPropertyDescriptor( object );
            addOffsetPropertyDescriptor( object );
            addScalarDenominatorPropertyDescriptor( object );
            addScalarFloatPropertyDescriptor( object );
            addScalarNumeratorPropertyDescriptor( object );
            addReadingTypePropertyDescriptor( object );
            addIntervalBlocksPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Multiply Before Add feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMultiplyBeforeAddPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_PendingCalculation_multiplyBeforeAdd_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_PendingCalculation_multiplyBeforeAdd_feature",
                        "_UI_PendingCalculation_type" ),
                CimPackage.eINSTANCE.getPendingCalculation_MultiplyBeforeAdd(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Offset feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addOffsetPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PendingCalculation_offset_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PendingCalculation_offset_feature",
                                "_UI_PendingCalculation_type" ),
                        CimPackage.eINSTANCE.getPendingCalculation_Offset(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Scalar Denominator feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addScalarDenominatorPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_PendingCalculation_scalarDenominator_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_PendingCalculation_scalarDenominator_feature",
                        "_UI_PendingCalculation_type" ),
                CimPackage.eINSTANCE.getPendingCalculation_ScalarDenominator(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Scalar Float feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addScalarFloatPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_PendingCalculation_scalarFloat_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_PendingCalculation_scalarFloat_feature",
                        "_UI_PendingCalculation_type" ),
                CimPackage.eINSTANCE.getPendingCalculation_ScalarFloat(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Scalar Numerator feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addScalarNumeratorPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_PendingCalculation_scalarNumerator_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_PendingCalculation_scalarNumerator_feature",
                        "_UI_PendingCalculation_type" ),
                CimPackage.eINSTANCE.getPendingCalculation_ScalarNumerator(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Reading Type feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addReadingTypePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_PendingCalculation_ReadingType_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_PendingCalculation_ReadingType_feature",
                        "_UI_PendingCalculation_type" ),
                CimPackage.eINSTANCE.getPendingCalculation_ReadingType(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Interval Blocks feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIntervalBlocksPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_PendingCalculation_IntervalBlocks_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_PendingCalculation_IntervalBlocks_feature",
                        "_UI_PendingCalculation_type" ),
                CimPackage.eINSTANCE.getPendingCalculation_IntervalBlocks(), true, false, true, null, null, null ) );
    }

    /**
     * This returns PendingCalculation.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/PendingCalculation" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( PendingCalculation ) object ).getID();
        return label == null || label.length() == 0 ? getString( "_UI_PendingCalculation_type" )
                : getString( "_UI_PendingCalculation_type" ) + " " + label;
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

        switch( notification.getFeatureID( PendingCalculation.class ) ) {
        case CimPackage.PENDING_CALCULATION__MULTIPLY_BEFORE_ADD:
        case CimPackage.PENDING_CALCULATION__OFFSET:
        case CimPackage.PENDING_CALCULATION__SCALAR_DENOMINATOR:
        case CimPackage.PENDING_CALCULATION__SCALAR_FLOAT:
        case CimPackage.PENDING_CALCULATION__SCALAR_NUMERATOR:
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
