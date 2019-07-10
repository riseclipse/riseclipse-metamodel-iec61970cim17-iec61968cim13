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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SynchronousMachineItemProvider extends RotatingMachineItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SynchronousMachineItemProvider( AdapterFactory adapterFactory ) {
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

            addAVRToManualLagPropertyDescriptor( object );
            addAVRToManualLeadPropertyDescriptor( object );
            addBaseQPropertyDescriptor( object );
            addCondenserPPropertyDescriptor( object );
            addCoolantConditionPropertyDescriptor( object );
            addCoolantTypePropertyDescriptor( object );
            addEarthingPropertyDescriptor( object );
            addEarthingStarPointRPropertyDescriptor( object );
            addEarthingStarPointXPropertyDescriptor( object );
            addIkkPropertyDescriptor( object );
            addManualToAVRPropertyDescriptor( object );
            addMaxQPropertyDescriptor( object );
            addMaxUPropertyDescriptor( object );
            addMinQPropertyDescriptor( object );
            addMinUPropertyDescriptor( object );
            addMuPropertyDescriptor( object );
            addOperatingModePropertyDescriptor( object );
            addQPercentPropertyDescriptor( object );
            addRPropertyDescriptor( object );
            addR0PropertyDescriptor( object );
            addR2PropertyDescriptor( object );
            addReferencePriorityPropertyDescriptor( object );
            addSatDirectSubtransXPropertyDescriptor( object );
            addSatDirectSyncXPropertyDescriptor( object );
            addSatDirectTransXPropertyDescriptor( object );
            addShortCircuitRotorTypePropertyDescriptor( object );
            addTypePropertyDescriptor( object );
            addVoltageRegulationRangePropertyDescriptor( object );
            addX0PropertyDescriptor( object );
            addX2PropertyDescriptor( object );
            addReactiveCapabilityCurvesPropertyDescriptor( object );
            addSynchronousMachineDynamicsPropertyDescriptor( object );
            addPrimeMoversPropertyDescriptor( object );
            addInitialReactiveCapabilityCurvePropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the AVR To Manual Lag feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAVRToManualLagPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_SynchronousMachine_aVRToManualLag_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_SynchronousMachine_aVRToManualLag_feature", "_UI_SynchronousMachine_type" ),
                        CimPackage.eINSTANCE.getSynchronousMachine_AVRToManualLag(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the AVR To Manual Lead feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAVRToManualLeadPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_SynchronousMachine_aVRToManualLead_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_SynchronousMachine_aVRToManualLead_feature", "_UI_SynchronousMachine_type" ),
                        CimPackage.eINSTANCE.getSynchronousMachine_AVRToManualLead(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Base Q feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addBaseQPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_SynchronousMachine_baseQ_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_SynchronousMachine_baseQ_feature",
                                "_UI_SynchronousMachine_type" ),
                        CimPackage.eINSTANCE.getSynchronousMachine_BaseQ(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Condenser P feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCondenserPPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_SynchronousMachine_condenserP_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_SynchronousMachine_condenserP_feature",
                                "_UI_SynchronousMachine_type" ),
                        CimPackage.eINSTANCE.getSynchronousMachine_CondenserP(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Coolant Condition feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCoolantConditionPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_SynchronousMachine_coolantCondition_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_SynchronousMachine_coolantCondition_feature", "_UI_SynchronousMachine_type" ),
                        CimPackage.eINSTANCE.getSynchronousMachine_CoolantCondition(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Coolant Type feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCoolantTypePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_SynchronousMachine_coolantType_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_SynchronousMachine_coolantType_feature",
                                "_UI_SynchronousMachine_type" ),
                        CimPackage.eINSTANCE.getSynchronousMachine_CoolantType(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Earthing feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEarthingPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_SynchronousMachine_earthing_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_SynchronousMachine_earthing_feature",
                                "_UI_SynchronousMachine_type" ),
                        CimPackage.eINSTANCE.getSynchronousMachine_Earthing(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Earthing Star Point R feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEarthingStarPointRPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_SynchronousMachine_earthingStarPointR_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_SynchronousMachine_earthingStarPointR_feature", "_UI_SynchronousMachine_type" ),
                        CimPackage.eINSTANCE.getSynchronousMachine_EarthingStarPointR(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Earthing Star Point X feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEarthingStarPointXPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_SynchronousMachine_earthingStarPointX_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_SynchronousMachine_earthingStarPointX_feature", "_UI_SynchronousMachine_type" ),
                        CimPackage.eINSTANCE.getSynchronousMachine_EarthingStarPointX(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Ikk feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIkkPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_SynchronousMachine_ikk_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_SynchronousMachine_ikk_feature",
                                "_UI_SynchronousMachine_type" ),
                        CimPackage.eINSTANCE.getSynchronousMachine_Ikk(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Manual To AVR feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addManualToAVRPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_SynchronousMachine_manualToAVR_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_SynchronousMachine_manualToAVR_feature",
                                "_UI_SynchronousMachine_type" ),
                        CimPackage.eINSTANCE.getSynchronousMachine_ManualToAVR(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Max Q feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMaxQPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_SynchronousMachine_maxQ_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_SynchronousMachine_maxQ_feature",
                                "_UI_SynchronousMachine_type" ),
                        CimPackage.eINSTANCE.getSynchronousMachine_MaxQ(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Max U feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMaxUPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_SynchronousMachine_maxU_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_SynchronousMachine_maxU_feature",
                                "_UI_SynchronousMachine_type" ),
                        CimPackage.eINSTANCE.getSynchronousMachine_MaxU(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Min Q feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMinQPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_SynchronousMachine_minQ_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_SynchronousMachine_minQ_feature",
                                "_UI_SynchronousMachine_type" ),
                        CimPackage.eINSTANCE.getSynchronousMachine_MinQ(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Min U feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMinUPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_SynchronousMachine_minU_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_SynchronousMachine_minU_feature",
                                "_UI_SynchronousMachine_type" ),
                        CimPackage.eINSTANCE.getSynchronousMachine_MinU(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Mu feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMuPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_SynchronousMachine_mu_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_SynchronousMachine_mu_feature",
                                "_UI_SynchronousMachine_type" ),
                        CimPackage.eINSTANCE.getSynchronousMachine_Mu(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Operating Mode feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addOperatingModePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_SynchronousMachine_operatingMode_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_SynchronousMachine_operatingMode_feature",
                                "_UI_SynchronousMachine_type" ),
                        CimPackage.eINSTANCE.getSynchronousMachine_OperatingMode(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the QPercent feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addQPercentPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_SynchronousMachine_qPercent_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_SynchronousMachine_qPercent_feature",
                                "_UI_SynchronousMachine_type" ),
                        CimPackage.eINSTANCE.getSynchronousMachine_QPercent(),
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
                        getString( "_UI_SynchronousMachine_r_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_SynchronousMachine_r_feature",
                                "_UI_SynchronousMachine_type" ),
                        CimPackage.eINSTANCE.getSynchronousMachine_R(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
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
                        getResourceLocator(),
                        getString( "_UI_SynchronousMachine_r0_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_SynchronousMachine_r0_feature",
                                "_UI_SynchronousMachine_type" ),
                        CimPackage.eINSTANCE.getSynchronousMachine_R0(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the R2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addR2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_SynchronousMachine_r2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_SynchronousMachine_r2_feature",
                                "_UI_SynchronousMachine_type" ),
                        CimPackage.eINSTANCE.getSynchronousMachine_R2(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Reference Priority feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addReferencePriorityPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_SynchronousMachine_referencePriority_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_SynchronousMachine_referencePriority_feature", "_UI_SynchronousMachine_type" ),
                        CimPackage.eINSTANCE.getSynchronousMachine_ReferencePriority(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Sat Direct Subtrans X feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSatDirectSubtransXPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_SynchronousMachine_satDirectSubtransX_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_SynchronousMachine_satDirectSubtransX_feature", "_UI_SynchronousMachine_type" ),
                        CimPackage.eINSTANCE.getSynchronousMachine_SatDirectSubtransX(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Sat Direct Sync X feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSatDirectSyncXPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_SynchronousMachine_satDirectSyncX_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_SynchronousMachine_satDirectSyncX_feature", "_UI_SynchronousMachine_type" ),
                        CimPackage.eINSTANCE.getSynchronousMachine_SatDirectSyncX(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Sat Direct Trans X feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSatDirectTransXPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_SynchronousMachine_satDirectTransX_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_SynchronousMachine_satDirectTransX_feature", "_UI_SynchronousMachine_type" ),
                        CimPackage.eINSTANCE.getSynchronousMachine_SatDirectTransX(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Short Circuit Rotor Type feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addShortCircuitRotorTypePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_SynchronousMachine_shortCircuitRotorType_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_SynchronousMachine_shortCircuitRotorType_feature", "_UI_SynchronousMachine_type" ),
                        CimPackage.eINSTANCE.getSynchronousMachine_ShortCircuitRotorType(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Type feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTypePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_SynchronousMachine_type_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_SynchronousMachine_type_feature",
                                "_UI_SynchronousMachine_type" ),
                        CimPackage.eINSTANCE.getSynchronousMachine_Type(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Voltage Regulation Range feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVoltageRegulationRangePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                getResourceLocator(),
                getString( "_UI_SynchronousMachine_voltageRegulationRange_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_SynchronousMachine_voltageRegulationRange_feature", "_UI_SynchronousMachine_type" ),
                CimPackage.eINSTANCE.getSynchronousMachine_VoltageRegulationRange(),
                true,
                false,
                false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                null,
                null ) );
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
                        getResourceLocator(),
                        getString( "_UI_SynchronousMachine_x0_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_SynchronousMachine_x0_feature",
                                "_UI_SynchronousMachine_type" ),
                        CimPackage.eINSTANCE.getSynchronousMachine_X0(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the X2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addX2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_SynchronousMachine_x2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_SynchronousMachine_x2_feature",
                                "_UI_SynchronousMachine_type" ),
                        CimPackage.eINSTANCE.getSynchronousMachine_X2(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Reactive Capability Curves feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addReactiveCapabilityCurvesPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                getResourceLocator(),
                getString( "_UI_SynchronousMachine_ReactiveCapabilityCurves_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_SynchronousMachine_ReactiveCapabilityCurves_feature", "_UI_SynchronousMachine_type" ),
                CimPackage.eINSTANCE.getSynchronousMachine_ReactiveCapabilityCurves(),
                true,
                false,
                true,
                null,
                null,
                null ) );
    }

    /**
     * This adds a property descriptor for the Synchronous Machine Dynamics feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSynchronousMachineDynamicsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                getResourceLocator(),
                getString( "_UI_SynchronousMachine_SynchronousMachineDynamics_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_SynchronousMachine_SynchronousMachineDynamics_feature", "_UI_SynchronousMachine_type" ),
                CimPackage.eINSTANCE.getSynchronousMachine_SynchronousMachineDynamics(),
                true,
                false,
                true,
                null,
                null,
                null ) );
    }

    /**
     * This adds a property descriptor for the Prime Movers feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPrimeMoversPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_SynchronousMachine_PrimeMovers_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_SynchronousMachine_PrimeMovers_feature",
                                "_UI_SynchronousMachine_type" ),
                        CimPackage.eINSTANCE.getSynchronousMachine_PrimeMovers(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Initial Reactive Capability Curve feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addInitialReactiveCapabilityCurvePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_SynchronousMachine_InitialReactiveCapabilityCurve_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_SynchronousMachine_InitialReactiveCapabilityCurve_feature",
                                "_UI_SynchronousMachine_type" ),
                        CimPackage.eINSTANCE.getSynchronousMachine_InitialReactiveCapabilityCurve(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This returns SynchronousMachine.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/SynchronousMachine" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( SynchronousMachine ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_SynchronousMachine_type" )
                : getString( "_UI_SynchronousMachine_type" ) + " " + label;
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

        switch( notification.getFeatureID( SynchronousMachine.class ) ) {
        case CimPackage.SYNCHRONOUS_MACHINE__AVR_TO_MANUAL_LAG:
        case CimPackage.SYNCHRONOUS_MACHINE__AVR_TO_MANUAL_LEAD:
        case CimPackage.SYNCHRONOUS_MACHINE__BASE_Q:
        case CimPackage.SYNCHRONOUS_MACHINE__CONDENSER_P:
        case CimPackage.SYNCHRONOUS_MACHINE__COOLANT_CONDITION:
        case CimPackage.SYNCHRONOUS_MACHINE__COOLANT_TYPE:
        case CimPackage.SYNCHRONOUS_MACHINE__EARTHING:
        case CimPackage.SYNCHRONOUS_MACHINE__EARTHING_STAR_POINT_R:
        case CimPackage.SYNCHRONOUS_MACHINE__EARTHING_STAR_POINT_X:
        case CimPackage.SYNCHRONOUS_MACHINE__IKK:
        case CimPackage.SYNCHRONOUS_MACHINE__MANUAL_TO_AVR:
        case CimPackage.SYNCHRONOUS_MACHINE__MAX_Q:
        case CimPackage.SYNCHRONOUS_MACHINE__MAX_U:
        case CimPackage.SYNCHRONOUS_MACHINE__MIN_Q:
        case CimPackage.SYNCHRONOUS_MACHINE__MIN_U:
        case CimPackage.SYNCHRONOUS_MACHINE__MU:
        case CimPackage.SYNCHRONOUS_MACHINE__OPERATING_MODE:
        case CimPackage.SYNCHRONOUS_MACHINE__QPERCENT:
        case CimPackage.SYNCHRONOUS_MACHINE__R:
        case CimPackage.SYNCHRONOUS_MACHINE__R0:
        case CimPackage.SYNCHRONOUS_MACHINE__R2:
        case CimPackage.SYNCHRONOUS_MACHINE__REFERENCE_PRIORITY:
        case CimPackage.SYNCHRONOUS_MACHINE__SAT_DIRECT_SUBTRANS_X:
        case CimPackage.SYNCHRONOUS_MACHINE__SAT_DIRECT_SYNC_X:
        case CimPackage.SYNCHRONOUS_MACHINE__SAT_DIRECT_TRANS_X:
        case CimPackage.SYNCHRONOUS_MACHINE__SHORT_CIRCUIT_ROTOR_TYPE:
        case CimPackage.SYNCHRONOUS_MACHINE__TYPE:
        case CimPackage.SYNCHRONOUS_MACHINE__VOLTAGE_REGULATION_RANGE:
        case CimPackage.SYNCHRONOUS_MACHINE__X0:
        case CimPackage.SYNCHRONOUS_MACHINE__X2:
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
