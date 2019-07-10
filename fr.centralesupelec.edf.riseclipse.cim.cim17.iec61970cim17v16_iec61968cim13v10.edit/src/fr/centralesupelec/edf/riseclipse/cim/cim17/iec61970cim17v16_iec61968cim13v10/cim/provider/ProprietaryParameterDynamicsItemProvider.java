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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProprietaryParameterDynamics;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProprietaryParameterDynamics} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ProprietaryParameterDynamicsItemProvider extends CimObjectWithIDItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ProprietaryParameterDynamicsItemProvider( AdapterFactory adapterFactory ) {
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

            addBooleanParameterValuePropertyDescriptor( object );
            addFloatParameterValuePropertyDescriptor( object );
            addIntegerParameterValuePropertyDescriptor( object );
            addParameterNumberPropertyDescriptor( object );
            addSynchronousMachineUserDefinedPropertyDescriptor( object );
            addPowerSystemStabilizerUserDefinedPropertyDescriptor( object );
            addWindType3or4UserDefinedPropertyDescriptor( object );
            addDiscontinuousExcitationControlUserDefinedPropertyDescriptor( object );
            addLoadUserDefinedPropertyDescriptor( object );
            addTurbineGovernorUserDefinedPropertyDescriptor( object );
            addWindType1or2UserDefinedPropertyDescriptor( object );
            addExcitationSystemUserDefinedPropertyDescriptor( object );
            addVoltageAdjusterUserDefinedPropertyDescriptor( object );
            addPFVArControllerType2UserDefinedPropertyDescriptor( object );
            addTurbineLoadControllerUserDefinedPropertyDescriptor( object );
            addUnderexcitationLimiterUserDefinedPropertyDescriptor( object );
            addAsynchronousMachineUserDefinedPropertyDescriptor( object );
            addPFVArControllerType1UserDefinedPropertyDescriptor( object );
            addOverexcitationLimiterUserDefinedPropertyDescriptor( object );
            addWindPlantUserDefinedPropertyDescriptor( object );
            addMechanicalLoadUserDefinedPropertyDescriptor( object );
            addVoltageCompensatorUserDefinedPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Boolean Parameter Value feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addBooleanParameterValuePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_ProprietaryParameterDynamics_booleanParameterValue_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_ProprietaryParameterDynamics_booleanParameterValue_feature",
                        "_UI_ProprietaryParameterDynamics_type" ),
                CimPackage.eINSTANCE.getProprietaryParameterDynamics_BooleanParameterValue(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Float Parameter Value feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFloatParameterValuePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_ProprietaryParameterDynamics_floatParameterValue_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_ProprietaryParameterDynamics_floatParameterValue_feature",
                        "_UI_ProprietaryParameterDynamics_type" ),
                CimPackage.eINSTANCE.getProprietaryParameterDynamics_FloatParameterValue(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Integer Parameter Value feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIntegerParameterValuePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_ProprietaryParameterDynamics_integerParameterValue_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_ProprietaryParameterDynamics_integerParameterValue_feature",
                        "_UI_ProprietaryParameterDynamics_type" ),
                CimPackage.eINSTANCE.getProprietaryParameterDynamics_IntegerParameterValue(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Parameter Number feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addParameterNumberPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ProprietaryParameterDynamics_parameterNumber_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_ProprietaryParameterDynamics_parameterNumber_feature",
                                "_UI_ProprietaryParameterDynamics_type" ),
                        CimPackage.eINSTANCE.getProprietaryParameterDynamics_ParameterNumber(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Synchronous Machine User Defined feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSynchronousMachineUserDefinedPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_ProprietaryParameterDynamics_SynchronousMachineUserDefined_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_ProprietaryParameterDynamics_SynchronousMachineUserDefined_feature",
                        "_UI_ProprietaryParameterDynamics_type" ),
                CimPackage.eINSTANCE.getProprietaryParameterDynamics_SynchronousMachineUserDefined(), true, false, true,
                null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Power System Stabilizer User Defined feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPowerSystemStabilizerUserDefinedPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_ProprietaryParameterDynamics_PowerSystemStabilizerUserDefined_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_ProprietaryParameterDynamics_PowerSystemStabilizerUserDefined_feature",
                        "_UI_ProprietaryParameterDynamics_type" ),
                CimPackage.eINSTANCE.getProprietaryParameterDynamics_PowerSystemStabilizerUserDefined(), true, false,
                true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Wind Type3or4 User Defined feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addWindType3or4UserDefinedPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_ProprietaryParameterDynamics_WindType3or4UserDefined_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_ProprietaryParameterDynamics_WindType3or4UserDefined_feature",
                        "_UI_ProprietaryParameterDynamics_type" ),
                CimPackage.eINSTANCE.getProprietaryParameterDynamics_WindType3or4UserDefined(), true, false, true, null,
                null, null ) );
    }

    /**
     * This adds a property descriptor for the Discontinuous Excitation Control User Defined feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDiscontinuousExcitationControlUserDefinedPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_ProprietaryParameterDynamics_DiscontinuousExcitationControlUserDefined_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_ProprietaryParameterDynamics_DiscontinuousExcitationControlUserDefined_feature",
                        "_UI_ProprietaryParameterDynamics_type" ),
                CimPackage.eINSTANCE.getProprietaryParameterDynamics_DiscontinuousExcitationControlUserDefined(), true,
                false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Load User Defined feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLoadUserDefinedPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ProprietaryParameterDynamics_LoadUserDefined_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_ProprietaryParameterDynamics_LoadUserDefined_feature",
                                "_UI_ProprietaryParameterDynamics_type" ),
                        CimPackage.eINSTANCE.getProprietaryParameterDynamics_LoadUserDefined(), true, false, true, null,
                        null, null ) );
    }

    /**
     * This adds a property descriptor for the Turbine Governor User Defined feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTurbineGovernorUserDefinedPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_ProprietaryParameterDynamics_TurbineGovernorUserDefined_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_ProprietaryParameterDynamics_TurbineGovernorUserDefined_feature",
                        "_UI_ProprietaryParameterDynamics_type" ),
                CimPackage.eINSTANCE.getProprietaryParameterDynamics_TurbineGovernorUserDefined(), true, false, true,
                null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Wind Type1or2 User Defined feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addWindType1or2UserDefinedPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_ProprietaryParameterDynamics_WindType1or2UserDefined_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_ProprietaryParameterDynamics_WindType1or2UserDefined_feature",
                        "_UI_ProprietaryParameterDynamics_type" ),
                CimPackage.eINSTANCE.getProprietaryParameterDynamics_WindType1or2UserDefined(), true, false, true, null,
                null, null ) );
    }

    /**
     * This adds a property descriptor for the Excitation System User Defined feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addExcitationSystemUserDefinedPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_ProprietaryParameterDynamics_ExcitationSystemUserDefined_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_ProprietaryParameterDynamics_ExcitationSystemUserDefined_feature",
                        "_UI_ProprietaryParameterDynamics_type" ),
                CimPackage.eINSTANCE.getProprietaryParameterDynamics_ExcitationSystemUserDefined(), true, false, true,
                null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Voltage Adjuster User Defined feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVoltageAdjusterUserDefinedPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_ProprietaryParameterDynamics_VoltageAdjusterUserDefined_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_ProprietaryParameterDynamics_VoltageAdjusterUserDefined_feature",
                        "_UI_ProprietaryParameterDynamics_type" ),
                CimPackage.eINSTANCE.getProprietaryParameterDynamics_VoltageAdjusterUserDefined(), true, false, true,
                null, null, null ) );
    }

    /**
     * This adds a property descriptor for the PFV Ar Controller Type2 User Defined feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPFVArControllerType2UserDefinedPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_ProprietaryParameterDynamics_PFVArControllerType2UserDefined_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_ProprietaryParameterDynamics_PFVArControllerType2UserDefined_feature",
                        "_UI_ProprietaryParameterDynamics_type" ),
                CimPackage.eINSTANCE.getProprietaryParameterDynamics_PFVArControllerType2UserDefined(), true, false,
                true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Turbine Load Controller User Defined feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTurbineLoadControllerUserDefinedPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_ProprietaryParameterDynamics_TurbineLoadControllerUserDefined_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_ProprietaryParameterDynamics_TurbineLoadControllerUserDefined_feature",
                        "_UI_ProprietaryParameterDynamics_type" ),
                CimPackage.eINSTANCE.getProprietaryParameterDynamics_TurbineLoadControllerUserDefined(), true, false,
                true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Underexcitation Limiter User Defined feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUnderexcitationLimiterUserDefinedPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_ProprietaryParameterDynamics_UnderexcitationLimiterUserDefined_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_ProprietaryParameterDynamics_UnderexcitationLimiterUserDefined_feature",
                        "_UI_ProprietaryParameterDynamics_type" ),
                CimPackage.eINSTANCE.getProprietaryParameterDynamics_UnderexcitationLimiterUserDefined(), true, false,
                true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Asynchronous Machine User Defined feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAsynchronousMachineUserDefinedPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_ProprietaryParameterDynamics_AsynchronousMachineUserDefined_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_ProprietaryParameterDynamics_AsynchronousMachineUserDefined_feature",
                        "_UI_ProprietaryParameterDynamics_type" ),
                CimPackage.eINSTANCE.getProprietaryParameterDynamics_AsynchronousMachineUserDefined(), true, false,
                true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the PFV Ar Controller Type1 User Defined feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPFVArControllerType1UserDefinedPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_ProprietaryParameterDynamics_PFVArControllerType1UserDefined_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_ProprietaryParameterDynamics_PFVArControllerType1UserDefined_feature",
                        "_UI_ProprietaryParameterDynamics_type" ),
                CimPackage.eINSTANCE.getProprietaryParameterDynamics_PFVArControllerType1UserDefined(), true, false,
                true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Overexcitation Limiter User Defined feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addOverexcitationLimiterUserDefinedPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_ProprietaryParameterDynamics_OverexcitationLimiterUserDefined_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_ProprietaryParameterDynamics_OverexcitationLimiterUserDefined_feature",
                        "_UI_ProprietaryParameterDynamics_type" ),
                CimPackage.eINSTANCE.getProprietaryParameterDynamics_OverexcitationLimiterUserDefined(), true, false,
                true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Wind Plant User Defined feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addWindPlantUserDefinedPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_ProprietaryParameterDynamics_WindPlantUserDefined_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_ProprietaryParameterDynamics_WindPlantUserDefined_feature",
                        "_UI_ProprietaryParameterDynamics_type" ),
                CimPackage.eINSTANCE.getProprietaryParameterDynamics_WindPlantUserDefined(), true, false, true, null,
                null, null ) );
    }

    /**
     * This adds a property descriptor for the Mechanical Load User Defined feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMechanicalLoadUserDefinedPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_ProprietaryParameterDynamics_MechanicalLoadUserDefined_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_ProprietaryParameterDynamics_MechanicalLoadUserDefined_feature",
                        "_UI_ProprietaryParameterDynamics_type" ),
                CimPackage.eINSTANCE.getProprietaryParameterDynamics_MechanicalLoadUserDefined(), true, false, true,
                null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Voltage Compensator User Defined feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVoltageCompensatorUserDefinedPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_ProprietaryParameterDynamics_VoltageCompensatorUserDefined_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_ProprietaryParameterDynamics_VoltageCompensatorUserDefined_feature",
                        "_UI_ProprietaryParameterDynamics_type" ),
                CimPackage.eINSTANCE.getProprietaryParameterDynamics_VoltageCompensatorUserDefined(), true, false, true,
                null, null, null ) );
    }

    /**
     * This returns ProprietaryParameterDynamics.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/ProprietaryParameterDynamics" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( ProprietaryParameterDynamics ) object ).getID();
        return label == null || label.length() == 0 ? getString( "_UI_ProprietaryParameterDynamics_type" )
                : getString( "_UI_ProprietaryParameterDynamics_type" ) + " " + label;
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

        switch( notification.getFeatureID( ProprietaryParameterDynamics.class ) ) {
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__BOOLEAN_PARAMETER_VALUE:
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__FLOAT_PARAMETER_VALUE:
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__INTEGER_PARAMETER_VALUE:
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__PARAMETER_NUMBER:
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
