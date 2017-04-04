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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachine;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachine} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AsynchronousMachineItemProvider extends RotatingMachineItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AsynchronousMachineItemProvider( AdapterFactory adapterFactory ) {
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

            addAsynchronousMachineTypePropertyDescriptor( object );
            addConverterFedDrivePropertyDescriptor( object );
            addEfficiencyPropertyDescriptor( object );
            addIaIrRatioPropertyDescriptor( object );
            addNominalFrequencyPropertyDescriptor( object );
            addNominalSpeedPropertyDescriptor( object );
            addPolePairNumberPropertyDescriptor( object );
            addRatedMechanicalPowerPropertyDescriptor( object );
            addReversiblePropertyDescriptor( object );
            addRr1PropertyDescriptor( object );
            addRr2PropertyDescriptor( object );
            addRxLockedRotorRatioPropertyDescriptor( object );
            addTpoPropertyDescriptor( object );
            addTppoPropertyDescriptor( object );
            addXlr1PropertyDescriptor( object );
            addXlr2PropertyDescriptor( object );
            addXmPropertyDescriptor( object );
            addXpPropertyDescriptor( object );
            addXppPropertyDescriptor( object );
            addXsPropertyDescriptor( object );
            addAsynchronousMachineDynamicsPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Asynchronous Machine Type feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAsynchronousMachineTypePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_AsynchronousMachine_asynchronousMachineType_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_AsynchronousMachine_asynchronousMachineType_feature", "_UI_AsynchronousMachine_type" ),
                CimPackage.eINSTANCE.getAsynchronousMachine_AsynchronousMachineType(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Converter Fed Drive feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addConverterFedDrivePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_AsynchronousMachine_converterFedDrive_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_AsynchronousMachine_converterFedDrive_feature", "_UI_AsynchronousMachine_type" ),
                        CimPackage.eINSTANCE.getAsynchronousMachine_ConverterFedDrive(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Efficiency feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEfficiencyPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_AsynchronousMachine_efficiency_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_AsynchronousMachine_efficiency_feature",
                        "_UI_AsynchronousMachine_type" ),
                CimPackage.eINSTANCE.getAsynchronousMachine_Efficiency(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Ia Ir Ratio feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIaIrRatioPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_AsynchronousMachine_iaIrRatio_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_AsynchronousMachine_iaIrRatio_feature",
                        "_UI_AsynchronousMachine_type" ),
                CimPackage.eINSTANCE.getAsynchronousMachine_IaIrRatio(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Nominal Frequency feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addNominalFrequencyPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_AsynchronousMachine_nominalFrequency_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_AsynchronousMachine_nominalFrequency_feature", "_UI_AsynchronousMachine_type" ),
                        CimPackage.eINSTANCE.getAsynchronousMachine_NominalFrequency(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Nominal Speed feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addNominalSpeedPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_AsynchronousMachine_nominalSpeed_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_AsynchronousMachine_nominalSpeed_feature",
                        "_UI_AsynchronousMachine_type" ),
                CimPackage.eINSTANCE.getAsynchronousMachine_NominalSpeed(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Pole Pair Number feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPolePairNumberPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_AsynchronousMachine_polePairNumber_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_AsynchronousMachine_polePairNumber_feature",
                        "_UI_AsynchronousMachine_type" ),
                CimPackage.eINSTANCE.getAsynchronousMachine_PolePairNumber(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Rated Mechanical Power feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRatedMechanicalPowerPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_AsynchronousMachine_ratedMechanicalPower_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_AsynchronousMachine_ratedMechanicalPower_feature",
                        "_UI_AsynchronousMachine_type" ),
                CimPackage.eINSTANCE.getAsynchronousMachine_RatedMechanicalPower(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Reversible feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addReversiblePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_AsynchronousMachine_reversible_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_AsynchronousMachine_reversible_feature",
                        "_UI_AsynchronousMachine_type" ),
                CimPackage.eINSTANCE.getAsynchronousMachine_Reversible(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Rr1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRr1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_AsynchronousMachine_rr1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_AsynchronousMachine_rr1_feature",
                                "_UI_AsynchronousMachine_type" ),
                        CimPackage.eINSTANCE.getAsynchronousMachine_Rr1(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Rr2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRr2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_AsynchronousMachine_rr2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_AsynchronousMachine_rr2_feature",
                                "_UI_AsynchronousMachine_type" ),
                        CimPackage.eINSTANCE.getAsynchronousMachine_Rr2(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Rx Locked Rotor Ratio feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRxLockedRotorRatioPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_AsynchronousMachine_rxLockedRotorRatio_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_AsynchronousMachine_rxLockedRotorRatio_feature", "_UI_AsynchronousMachine_type" ),
                        CimPackage.eINSTANCE.getAsynchronousMachine_RxLockedRotorRatio(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tpo feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTpoPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_AsynchronousMachine_tpo_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_AsynchronousMachine_tpo_feature",
                                "_UI_AsynchronousMachine_type" ),
                        CimPackage.eINSTANCE.getAsynchronousMachine_Tpo(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tppo feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTppoPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_AsynchronousMachine_tppo_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_AsynchronousMachine_tppo_feature",
                                "_UI_AsynchronousMachine_type" ),
                        CimPackage.eINSTANCE.getAsynchronousMachine_Tppo(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Xlr1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addXlr1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_AsynchronousMachine_xlr1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_AsynchronousMachine_xlr1_feature",
                                "_UI_AsynchronousMachine_type" ),
                        CimPackage.eINSTANCE.getAsynchronousMachine_Xlr1(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Xlr2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addXlr2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_AsynchronousMachine_xlr2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_AsynchronousMachine_xlr2_feature",
                                "_UI_AsynchronousMachine_type" ),
                        CimPackage.eINSTANCE.getAsynchronousMachine_Xlr2(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Xm feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addXmPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_AsynchronousMachine_xm_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_AsynchronousMachine_xm_feature",
                                "_UI_AsynchronousMachine_type" ),
                        CimPackage.eINSTANCE.getAsynchronousMachine_Xm(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Xp feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addXpPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_AsynchronousMachine_xp_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_AsynchronousMachine_xp_feature",
                                "_UI_AsynchronousMachine_type" ),
                        CimPackage.eINSTANCE.getAsynchronousMachine_Xp(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Xpp feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addXppPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_AsynchronousMachine_xpp_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_AsynchronousMachine_xpp_feature",
                                "_UI_AsynchronousMachine_type" ),
                        CimPackage.eINSTANCE.getAsynchronousMachine_Xpp(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Xs feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addXsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_AsynchronousMachine_xs_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_AsynchronousMachine_xs_feature",
                                "_UI_AsynchronousMachine_type" ),
                        CimPackage.eINSTANCE.getAsynchronousMachine_Xs(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Asynchronous Machine Dynamics feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAsynchronousMachineDynamicsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_AsynchronousMachine_AsynchronousMachineDynamics_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_AsynchronousMachine_AsynchronousMachineDynamics_feature", "_UI_AsynchronousMachine_type" ),
                CimPackage.eINSTANCE.getAsynchronousMachine_AsynchronousMachineDynamics(), true, false, true, null,
                null, null ) );
    }

    /**
     * This returns AsynchronousMachine.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/AsynchronousMachine" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( AsynchronousMachine ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_AsynchronousMachine_type" )
                : getString( "_UI_AsynchronousMachine_type" ) + " " + label;
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

        switch( notification.getFeatureID( AsynchronousMachine.class ) ) {
        case CimPackage.ASYNCHRONOUS_MACHINE__ASYNCHRONOUS_MACHINE_TYPE:
        case CimPackage.ASYNCHRONOUS_MACHINE__CONVERTER_FED_DRIVE:
        case CimPackage.ASYNCHRONOUS_MACHINE__EFFICIENCY:
        case CimPackage.ASYNCHRONOUS_MACHINE__IA_IR_RATIO:
        case CimPackage.ASYNCHRONOUS_MACHINE__NOMINAL_FREQUENCY:
        case CimPackage.ASYNCHRONOUS_MACHINE__NOMINAL_SPEED:
        case CimPackage.ASYNCHRONOUS_MACHINE__POLE_PAIR_NUMBER:
        case CimPackage.ASYNCHRONOUS_MACHINE__RATED_MECHANICAL_POWER:
        case CimPackage.ASYNCHRONOUS_MACHINE__REVERSIBLE:
        case CimPackage.ASYNCHRONOUS_MACHINE__RR1:
        case CimPackage.ASYNCHRONOUS_MACHINE__RR2:
        case CimPackage.ASYNCHRONOUS_MACHINE__RX_LOCKED_ROTOR_RATIO:
        case CimPackage.ASYNCHRONOUS_MACHINE__TPO:
        case CimPackage.ASYNCHRONOUS_MACHINE__TPPO:
        case CimPackage.ASYNCHRONOUS_MACHINE__XLR1:
        case CimPackage.ASYNCHRONOUS_MACHINE__XLR2:
        case CimPackage.ASYNCHRONOUS_MACHINE__XM:
        case CimPackage.ASYNCHRONOUS_MACHINE__XP:
        case CimPackage.ASYNCHRONOUS_MACHINE__XPP:
        case CimPackage.ASYNCHRONOUS_MACHINE__XS:
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
