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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShortCircuitTest;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShortCircuitTest} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ShortCircuitTestItemProvider extends TransformerTestItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ShortCircuitTestItemProvider( AdapterFactory adapterFactory ) {
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

            addCurrentPropertyDescriptor( object );
            addEnergisedEndStepPropertyDescriptor( object );
            addGroundedEndStepPropertyDescriptor( object );
            addLeakageImpedancePropertyDescriptor( object );
            addLeakageImpedanceZeroPropertyDescriptor( object );
            addLossPropertyDescriptor( object );
            addLossZeroPropertyDescriptor( object );
            addPowerPropertyDescriptor( object );
            addVoltagePropertyDescriptor( object );
            addGroundedEndsPropertyDescriptor( object );
            addEnergisedEndPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Current feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCurrentPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ShortCircuitTest_current_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ShortCircuitTest_current_feature",
                                "_UI_ShortCircuitTest_type" ),
                        CimPackage.eINSTANCE.getShortCircuitTest_Current(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Energised End Step feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEnergisedEndStepPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_ShortCircuitTest_energisedEndStep_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_ShortCircuitTest_energisedEndStep_feature",
                        "_UI_ShortCircuitTest_type" ),
                CimPackage.eINSTANCE.getShortCircuitTest_EnergisedEndStep(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Grounded End Step feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addGroundedEndStepPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_ShortCircuitTest_groundedEndStep_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_ShortCircuitTest_groundedEndStep_feature",
                        "_UI_ShortCircuitTest_type" ),
                CimPackage.eINSTANCE.getShortCircuitTest_GroundedEndStep(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Leakage Impedance feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLeakageImpedancePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_ShortCircuitTest_leakageImpedance_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_ShortCircuitTest_leakageImpedance_feature",
                        "_UI_ShortCircuitTest_type" ),
                CimPackage.eINSTANCE.getShortCircuitTest_LeakageImpedance(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Leakage Impedance Zero feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLeakageImpedanceZeroPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_ShortCircuitTest_leakageImpedanceZero_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_ShortCircuitTest_leakageImpedanceZero_feature",
                        "_UI_ShortCircuitTest_type" ),
                CimPackage.eINSTANCE.getShortCircuitTest_LeakageImpedanceZero(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Loss feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLossPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ShortCircuitTest_loss_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ShortCircuitTest_loss_feature",
                                "_UI_ShortCircuitTest_type" ),
                        CimPackage.eINSTANCE.getShortCircuitTest_Loss(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Loss Zero feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLossZeroPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ShortCircuitTest_lossZero_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ShortCircuitTest_lossZero_feature",
                                "_UI_ShortCircuitTest_type" ),
                        CimPackage.eINSTANCE.getShortCircuitTest_LossZero(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Power feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPowerPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ShortCircuitTest_power_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ShortCircuitTest_power_feature",
                                "_UI_ShortCircuitTest_type" ),
                        CimPackage.eINSTANCE.getShortCircuitTest_Power(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Voltage feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVoltagePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ShortCircuitTest_voltage_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ShortCircuitTest_voltage_feature",
                                "_UI_ShortCircuitTest_type" ),
                        CimPackage.eINSTANCE.getShortCircuitTest_Voltage(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Grounded Ends feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addGroundedEndsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ShortCircuitTest_GroundedEnds_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ShortCircuitTest_GroundedEnds_feature",
                                "_UI_ShortCircuitTest_type" ),
                        CimPackage.eINSTANCE.getShortCircuitTest_GroundedEnds(), true, false, true, null, null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Energised End feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEnergisedEndPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ShortCircuitTest_EnergisedEnd_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ShortCircuitTest_EnergisedEnd_feature",
                                "_UI_ShortCircuitTest_type" ),
                        CimPackage.eINSTANCE.getShortCircuitTest_EnergisedEnd(), true, false, true, null, null,
                        null ) );
    }

    /**
     * This returns ShortCircuitTest.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/ShortCircuitTest" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( ShortCircuitTest ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_ShortCircuitTest_type" )
                : getString( "_UI_ShortCircuitTest_type" ) + " " + label;
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

        switch( notification.getFeatureID( ShortCircuitTest.class ) ) {
        case CimPackage.SHORT_CIRCUIT_TEST__CURRENT:
        case CimPackage.SHORT_CIRCUIT_TEST__ENERGISED_END_STEP:
        case CimPackage.SHORT_CIRCUIT_TEST__GROUNDED_END_STEP:
        case CimPackage.SHORT_CIRCUIT_TEST__LEAKAGE_IMPEDANCE:
        case CimPackage.SHORT_CIRCUIT_TEST__LEAKAGE_IMPEDANCE_ZERO:
        case CimPackage.SHORT_CIRCUIT_TEST__LOSS:
        case CimPackage.SHORT_CIRCUIT_TEST__LOSS_ZERO:
        case CimPackage.SHORT_CIRCUIT_TEST__POWER:
        case CimPackage.SHORT_CIRCUIT_TEST__VOLTAGE:
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
