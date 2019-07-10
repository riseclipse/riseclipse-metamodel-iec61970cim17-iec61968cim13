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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EquivalentBranch;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EquivalentBranch} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EquivalentBranchItemProvider extends EquivalentEquipmentItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EquivalentBranchItemProvider( AdapterFactory adapterFactory ) {
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

            addNegativeR12PropertyDescriptor( object );
            addNegativeR21PropertyDescriptor( object );
            addNegativeX12PropertyDescriptor( object );
            addNegativeX21PropertyDescriptor( object );
            addPositiveR12PropertyDescriptor( object );
            addPositiveR21PropertyDescriptor( object );
            addPositiveX12PropertyDescriptor( object );
            addPositiveX21PropertyDescriptor( object );
            addRPropertyDescriptor( object );
            addR21PropertyDescriptor( object );
            addXPropertyDescriptor( object );
            addX21PropertyDescriptor( object );
            addZeroR12PropertyDescriptor( object );
            addZeroR21PropertyDescriptor( object );
            addZeroX12PropertyDescriptor( object );
            addZeroX21PropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Negative R12 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addNegativeR12PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_EquivalentBranch_negativeR12_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_EquivalentBranch_negativeR12_feature",
                                "_UI_EquivalentBranch_type" ),
                        CimPackage.eINSTANCE.getEquivalentBranch_NegativeR12(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Negative R21 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addNegativeR21PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_EquivalentBranch_negativeR21_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_EquivalentBranch_negativeR21_feature",
                                "_UI_EquivalentBranch_type" ),
                        CimPackage.eINSTANCE.getEquivalentBranch_NegativeR21(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Negative X12 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addNegativeX12PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_EquivalentBranch_negativeX12_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_EquivalentBranch_negativeX12_feature",
                                "_UI_EquivalentBranch_type" ),
                        CimPackage.eINSTANCE.getEquivalentBranch_NegativeX12(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Negative X21 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addNegativeX21PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_EquivalentBranch_negativeX21_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_EquivalentBranch_negativeX21_feature",
                                "_UI_EquivalentBranch_type" ),
                        CimPackage.eINSTANCE.getEquivalentBranch_NegativeX21(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Positive R12 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPositiveR12PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_EquivalentBranch_positiveR12_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_EquivalentBranch_positiveR12_feature",
                                "_UI_EquivalentBranch_type" ),
                        CimPackage.eINSTANCE.getEquivalentBranch_PositiveR12(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Positive R21 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPositiveR21PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_EquivalentBranch_positiveR21_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_EquivalentBranch_positiveR21_feature",
                                "_UI_EquivalentBranch_type" ),
                        CimPackage.eINSTANCE.getEquivalentBranch_PositiveR21(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Positive X12 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPositiveX12PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_EquivalentBranch_positiveX12_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_EquivalentBranch_positiveX12_feature",
                                "_UI_EquivalentBranch_type" ),
                        CimPackage.eINSTANCE.getEquivalentBranch_PositiveX12(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Positive X21 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPositiveX21PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_EquivalentBranch_positiveX21_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_EquivalentBranch_positiveX21_feature",
                                "_UI_EquivalentBranch_type" ),
                        CimPackage.eINSTANCE.getEquivalentBranch_PositiveX21(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the R feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_EquivalentBranch_r_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_EquivalentBranch_r_feature",
                                "_UI_EquivalentBranch_type" ),
                        CimPackage.eINSTANCE.getEquivalentBranch_R(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the R21 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addR21PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_EquivalentBranch_r21_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_EquivalentBranch_r21_feature",
                                "_UI_EquivalentBranch_type" ),
                        CimPackage.eINSTANCE.getEquivalentBranch_R21(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the X feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addXPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_EquivalentBranch_x_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_EquivalentBranch_x_feature",
                                "_UI_EquivalentBranch_type" ),
                        CimPackage.eINSTANCE.getEquivalentBranch_X(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the X21 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addX21PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_EquivalentBranch_x21_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_EquivalentBranch_x21_feature",
                                "_UI_EquivalentBranch_type" ),
                        CimPackage.eINSTANCE.getEquivalentBranch_X21(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Zero R12 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addZeroR12PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_EquivalentBranch_zeroR12_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_EquivalentBranch_zeroR12_feature",
                                "_UI_EquivalentBranch_type" ),
                        CimPackage.eINSTANCE.getEquivalentBranch_ZeroR12(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Zero R21 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addZeroR21PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_EquivalentBranch_zeroR21_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_EquivalentBranch_zeroR21_feature",
                                "_UI_EquivalentBranch_type" ),
                        CimPackage.eINSTANCE.getEquivalentBranch_ZeroR21(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Zero X12 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addZeroX12PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_EquivalentBranch_zeroX12_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_EquivalentBranch_zeroX12_feature",
                                "_UI_EquivalentBranch_type" ),
                        CimPackage.eINSTANCE.getEquivalentBranch_ZeroX12(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Zero X21 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addZeroX21PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_EquivalentBranch_zeroX21_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_EquivalentBranch_zeroX21_feature",
                                "_UI_EquivalentBranch_type" ),
                        CimPackage.eINSTANCE.getEquivalentBranch_ZeroX21(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This returns EquivalentBranch.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/EquivalentBranch" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( EquivalentBranch ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_EquivalentBranch_type" )
                : getString( "_UI_EquivalentBranch_type" ) + " " + label;
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

        switch( notification.getFeatureID( EquivalentBranch.class ) ) {
        case CimPackage.EQUIVALENT_BRANCH__NEGATIVE_R12:
        case CimPackage.EQUIVALENT_BRANCH__NEGATIVE_R21:
        case CimPackage.EQUIVALENT_BRANCH__NEGATIVE_X12:
        case CimPackage.EQUIVALENT_BRANCH__NEGATIVE_X21:
        case CimPackage.EQUIVALENT_BRANCH__POSITIVE_R12:
        case CimPackage.EQUIVALENT_BRANCH__POSITIVE_R21:
        case CimPackage.EQUIVALENT_BRANCH__POSITIVE_X12:
        case CimPackage.EQUIVALENT_BRANCH__POSITIVE_X21:
        case CimPackage.EQUIVALENT_BRANCH__R:
        case CimPackage.EQUIVALENT_BRANCH__R21:
        case CimPackage.EQUIVALENT_BRANCH__X:
        case CimPackage.EQUIVALENT_BRANCH__X21:
        case CimPackage.EQUIVALENT_BRANCH__ZERO_R12:
        case CimPackage.EQUIVALENT_BRANCH__ZERO_R21:
        case CimPackage.EQUIVALENT_BRANCH__ZERO_X12:
        case CimPackage.EQUIVALENT_BRANCH__ZERO_X21:
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
