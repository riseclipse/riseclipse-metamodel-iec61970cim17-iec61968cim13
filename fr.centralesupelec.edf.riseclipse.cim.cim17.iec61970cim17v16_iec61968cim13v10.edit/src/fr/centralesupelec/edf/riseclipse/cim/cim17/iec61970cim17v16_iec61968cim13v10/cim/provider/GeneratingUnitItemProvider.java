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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GeneratingUnitItemProvider extends EquipmentItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GeneratingUnitItemProvider( AdapterFactory adapterFactory ) {
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

            addAllocSpinResPPropertyDescriptor( object );
            addAutoCntrlMarginPPropertyDescriptor( object );
            addBasePPropertyDescriptor( object );
            addControlDeadbandPropertyDescriptor( object );
            addControlPulseHighPropertyDescriptor( object );
            addControlPulseLowPropertyDescriptor( object );
            addControlResponseRatePropertyDescriptor( object );
            addEfficiencyPropertyDescriptor( object );
            addGenControlModePropertyDescriptor( object );
            addGenControlSourcePropertyDescriptor( object );
            addGovernorMPLPropertyDescriptor( object );
            addGovernorSCDPropertyDescriptor( object );
            addHighControlLimitPropertyDescriptor( object );
            addInitialPPropertyDescriptor( object );
            addLongPFPropertyDescriptor( object );
            addLowControlLimitPropertyDescriptor( object );
            addLowerRampRatePropertyDescriptor( object );
            addMaxEconomicPPropertyDescriptor( object );
            addMaximumAllowableSpinningReservePropertyDescriptor( object );
            addMaxOperatingPPropertyDescriptor( object );
            addMinEconomicPPropertyDescriptor( object );
            addMinimumOffTimePropertyDescriptor( object );
            addMinOperatingPPropertyDescriptor( object );
            addModelDetailPropertyDescriptor( object );
            addNominalPPropertyDescriptor( object );
            addNormalPFPropertyDescriptor( object );
            addPenaltyFactorPropertyDescriptor( object );
            addRaiseRampRatePropertyDescriptor( object );
            addRatedGrossMaxPPropertyDescriptor( object );
            addRatedGrossMinPPropertyDescriptor( object );
            addRatedNetMaxPPropertyDescriptor( object );
            addShortPFPropertyDescriptor( object );
            addStartupCostPropertyDescriptor( object );
            addStartupTimePropertyDescriptor( object );
            addTieLinePFPropertyDescriptor( object );
            addTotalEfficiencyPropertyDescriptor( object );
            addVariableCostPropertyDescriptor( object );
            addRotatingMachinePropertyDescriptor( object );
            addGrossToNetActivePowerCurvesPropertyDescriptor( object );
            addControlAreaGeneratingUnitPropertyDescriptor( object );
            addGenUnitOpCostCurvesPropertyDescriptor( object );
            addGenUnitOpSchedulePropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Alloc Spin Res P feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAllocSpinResPPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GeneratingUnit_allocSpinResP_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GeneratingUnit_allocSpinResP_feature",
                                "_UI_GeneratingUnit_type" ),
                        CimPackage.eINSTANCE.getGeneratingUnit_AllocSpinResP(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Auto Cntrl Margin P feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAutoCntrlMarginPPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GeneratingUnit_autoCntrlMarginP_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GeneratingUnit_autoCntrlMarginP_feature",
                                "_UI_GeneratingUnit_type" ),
                        CimPackage.eINSTANCE.getGeneratingUnit_AutoCntrlMarginP(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Base P feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addBasePPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GeneratingUnit_baseP_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GeneratingUnit_baseP_feature",
                                "_UI_GeneratingUnit_type" ),
                        CimPackage.eINSTANCE.getGeneratingUnit_BaseP(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Control Deadband feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addControlDeadbandPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GeneratingUnit_controlDeadband_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GeneratingUnit_controlDeadband_feature",
                                "_UI_GeneratingUnit_type" ),
                        CimPackage.eINSTANCE.getGeneratingUnit_ControlDeadband(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Control Pulse High feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addControlPulseHighPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GeneratingUnit_controlPulseHigh_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GeneratingUnit_controlPulseHigh_feature",
                                "_UI_GeneratingUnit_type" ),
                        CimPackage.eINSTANCE.getGeneratingUnit_ControlPulseHigh(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Control Pulse Low feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addControlPulseLowPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GeneratingUnit_controlPulseLow_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GeneratingUnit_controlPulseLow_feature",
                                "_UI_GeneratingUnit_type" ),
                        CimPackage.eINSTANCE.getGeneratingUnit_ControlPulseLow(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Control Response Rate feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addControlResponseRatePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_GeneratingUnit_controlResponseRate_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_GeneratingUnit_controlResponseRate_feature",
                        "_UI_GeneratingUnit_type" ),
                CimPackage.eINSTANCE.getGeneratingUnit_ControlResponseRate(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Efficiency feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEfficiencyPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GeneratingUnit_efficiency_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GeneratingUnit_efficiency_feature",
                                "_UI_GeneratingUnit_type" ),
                        CimPackage.eINSTANCE.getGeneratingUnit_Efficiency(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Gen Control Mode feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addGenControlModePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GeneratingUnit_genControlMode_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GeneratingUnit_genControlMode_feature",
                                "_UI_GeneratingUnit_type" ),
                        CimPackage.eINSTANCE.getGeneratingUnit_GenControlMode(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Gen Control Source feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addGenControlSourcePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GeneratingUnit_genControlSource_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GeneratingUnit_genControlSource_feature",
                                "_UI_GeneratingUnit_type" ),
                        CimPackage.eINSTANCE.getGeneratingUnit_GenControlSource(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Governor MPL feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addGovernorMPLPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GeneratingUnit_governorMPL_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GeneratingUnit_governorMPL_feature",
                                "_UI_GeneratingUnit_type" ),
                        CimPackage.eINSTANCE.getGeneratingUnit_GovernorMPL(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Governor SCD feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addGovernorSCDPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GeneratingUnit_governorSCD_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GeneratingUnit_governorSCD_feature",
                                "_UI_GeneratingUnit_type" ),
                        CimPackage.eINSTANCE.getGeneratingUnit_GovernorSCD(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the High Control Limit feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addHighControlLimitPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GeneratingUnit_highControlLimit_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GeneratingUnit_highControlLimit_feature",
                                "_UI_GeneratingUnit_type" ),
                        CimPackage.eINSTANCE.getGeneratingUnit_HighControlLimit(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Initial P feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addInitialPPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GeneratingUnit_initialP_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GeneratingUnit_initialP_feature",
                                "_UI_GeneratingUnit_type" ),
                        CimPackage.eINSTANCE.getGeneratingUnit_InitialP(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Long PF feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLongPFPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GeneratingUnit_longPF_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GeneratingUnit_longPF_feature",
                                "_UI_GeneratingUnit_type" ),
                        CimPackage.eINSTANCE.getGeneratingUnit_LongPF(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Low Control Limit feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLowControlLimitPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GeneratingUnit_lowControlLimit_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GeneratingUnit_lowControlLimit_feature",
                                "_UI_GeneratingUnit_type" ),
                        CimPackage.eINSTANCE.getGeneratingUnit_LowControlLimit(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Lower Ramp Rate feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLowerRampRatePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GeneratingUnit_lowerRampRate_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GeneratingUnit_lowerRampRate_feature",
                                "_UI_GeneratingUnit_type" ),
                        CimPackage.eINSTANCE.getGeneratingUnit_LowerRampRate(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Max Economic P feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMaxEconomicPPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GeneratingUnit_maxEconomicP_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GeneratingUnit_maxEconomicP_feature",
                                "_UI_GeneratingUnit_type" ),
                        CimPackage.eINSTANCE.getGeneratingUnit_MaxEconomicP(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Maximum Allowable Spinning Reserve feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMaximumAllowableSpinningReservePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_GeneratingUnit_maximumAllowableSpinningReserve_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_GeneratingUnit_maximumAllowableSpinningReserve_feature", "_UI_GeneratingUnit_type" ),
                CimPackage.eINSTANCE.getGeneratingUnit_MaximumAllowableSpinningReserve(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Max Operating P feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMaxOperatingPPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GeneratingUnit_maxOperatingP_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GeneratingUnit_maxOperatingP_feature",
                                "_UI_GeneratingUnit_type" ),
                        CimPackage.eINSTANCE.getGeneratingUnit_MaxOperatingP(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Min Economic P feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMinEconomicPPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GeneratingUnit_minEconomicP_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GeneratingUnit_minEconomicP_feature",
                                "_UI_GeneratingUnit_type" ),
                        CimPackage.eINSTANCE.getGeneratingUnit_MinEconomicP(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Minimum Off Time feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMinimumOffTimePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GeneratingUnit_minimumOffTime_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GeneratingUnit_minimumOffTime_feature",
                                "_UI_GeneratingUnit_type" ),
                        CimPackage.eINSTANCE.getGeneratingUnit_MinimumOffTime(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Min Operating P feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMinOperatingPPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GeneratingUnit_minOperatingP_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GeneratingUnit_minOperatingP_feature",
                                "_UI_GeneratingUnit_type" ),
                        CimPackage.eINSTANCE.getGeneratingUnit_MinOperatingP(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Model Detail feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addModelDetailPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GeneratingUnit_modelDetail_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GeneratingUnit_modelDetail_feature",
                                "_UI_GeneratingUnit_type" ),
                        CimPackage.eINSTANCE.getGeneratingUnit_ModelDetail(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Nominal P feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addNominalPPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GeneratingUnit_nominalP_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GeneratingUnit_nominalP_feature",
                                "_UI_GeneratingUnit_type" ),
                        CimPackage.eINSTANCE.getGeneratingUnit_NominalP(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Normal PF feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addNormalPFPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GeneratingUnit_normalPF_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GeneratingUnit_normalPF_feature",
                                "_UI_GeneratingUnit_type" ),
                        CimPackage.eINSTANCE.getGeneratingUnit_NormalPF(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Penalty Factor feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPenaltyFactorPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GeneratingUnit_penaltyFactor_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GeneratingUnit_penaltyFactor_feature",
                                "_UI_GeneratingUnit_type" ),
                        CimPackage.eINSTANCE.getGeneratingUnit_PenaltyFactor(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Raise Ramp Rate feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRaiseRampRatePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GeneratingUnit_raiseRampRate_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GeneratingUnit_raiseRampRate_feature",
                                "_UI_GeneratingUnit_type" ),
                        CimPackage.eINSTANCE.getGeneratingUnit_RaiseRampRate(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Rated Gross Max P feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRatedGrossMaxPPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GeneratingUnit_ratedGrossMaxP_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GeneratingUnit_ratedGrossMaxP_feature",
                                "_UI_GeneratingUnit_type" ),
                        CimPackage.eINSTANCE.getGeneratingUnit_RatedGrossMaxP(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Rated Gross Min P feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRatedGrossMinPPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GeneratingUnit_ratedGrossMinP_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GeneratingUnit_ratedGrossMinP_feature",
                                "_UI_GeneratingUnit_type" ),
                        CimPackage.eINSTANCE.getGeneratingUnit_RatedGrossMinP(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Rated Net Max P feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRatedNetMaxPPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GeneratingUnit_ratedNetMaxP_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GeneratingUnit_ratedNetMaxP_feature",
                                "_UI_GeneratingUnit_type" ),
                        CimPackage.eINSTANCE.getGeneratingUnit_RatedNetMaxP(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Short PF feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addShortPFPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GeneratingUnit_shortPF_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GeneratingUnit_shortPF_feature",
                                "_UI_GeneratingUnit_type" ),
                        CimPackage.eINSTANCE.getGeneratingUnit_ShortPF(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Startup Cost feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addStartupCostPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GeneratingUnit_startupCost_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GeneratingUnit_startupCost_feature",
                                "_UI_GeneratingUnit_type" ),
                        CimPackage.eINSTANCE.getGeneratingUnit_StartupCost(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Startup Time feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addStartupTimePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GeneratingUnit_startupTime_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GeneratingUnit_startupTime_feature",
                                "_UI_GeneratingUnit_type" ),
                        CimPackage.eINSTANCE.getGeneratingUnit_StartupTime(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tie Line PF feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTieLinePFPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GeneratingUnit_tieLinePF_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GeneratingUnit_tieLinePF_feature",
                                "_UI_GeneratingUnit_type" ),
                        CimPackage.eINSTANCE.getGeneratingUnit_TieLinePF(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Total Efficiency feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTotalEfficiencyPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GeneratingUnit_totalEfficiency_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GeneratingUnit_totalEfficiency_feature",
                                "_UI_GeneratingUnit_type" ),
                        CimPackage.eINSTANCE.getGeneratingUnit_TotalEfficiency(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Variable Cost feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVariableCostPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GeneratingUnit_variableCost_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GeneratingUnit_variableCost_feature",
                                "_UI_GeneratingUnit_type" ),
                        CimPackage.eINSTANCE.getGeneratingUnit_VariableCost(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Rotating Machine feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRotatingMachinePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GeneratingUnit_RotatingMachine_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GeneratingUnit_RotatingMachine_feature",
                                "_UI_GeneratingUnit_type" ),
                        CimPackage.eINSTANCE.getGeneratingUnit_RotatingMachine(), true, false, true, null, null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Gross To Net Active Power Curves feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addGrossToNetActivePowerCurvesPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GeneratingUnit_GrossToNetActivePowerCurves_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_GeneratingUnit_GrossToNetActivePowerCurves_feature", "_UI_GeneratingUnit_type" ),
                        CimPackage.eINSTANCE.getGeneratingUnit_GrossToNetActivePowerCurves(), true, false, true, null,
                        null, null ) );
    }

    /**
     * This adds a property descriptor for the Control Area Generating Unit feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addControlAreaGeneratingUnitPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_GeneratingUnit_ControlAreaGeneratingUnit_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_GeneratingUnit_ControlAreaGeneratingUnit_feature",
                        "_UI_GeneratingUnit_type" ),
                CimPackage.eINSTANCE.getGeneratingUnit_ControlAreaGeneratingUnit(), true, false, true, null, null,
                null ) );
    }

    /**
     * This adds a property descriptor for the Gen Unit Op Cost Curves feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addGenUnitOpCostCurvesPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_GeneratingUnit_GenUnitOpCostCurves_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_GeneratingUnit_GenUnitOpCostCurves_feature",
                        "_UI_GeneratingUnit_type" ),
                CimPackage.eINSTANCE.getGeneratingUnit_GenUnitOpCostCurves(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Gen Unit Op Schedule feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addGenUnitOpSchedulePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GeneratingUnit_GenUnitOpSchedule_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GeneratingUnit_GenUnitOpSchedule_feature",
                                "_UI_GeneratingUnit_type" ),
                        CimPackage.eINSTANCE.getGeneratingUnit_GenUnitOpSchedule(), true, false, true, null, null,
                        null ) );
    }

    /**
     * This returns GeneratingUnit.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/GeneratingUnit" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( GeneratingUnit ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_GeneratingUnit_type" )
                : getString( "_UI_GeneratingUnit_type" ) + " " + label;
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

        switch( notification.getFeatureID( GeneratingUnit.class ) ) {
        case CimPackage.GENERATING_UNIT__ALLOC_SPIN_RES_P:
        case CimPackage.GENERATING_UNIT__AUTO_CNTRL_MARGIN_P:
        case CimPackage.GENERATING_UNIT__BASE_P:
        case CimPackage.GENERATING_UNIT__CONTROL_DEADBAND:
        case CimPackage.GENERATING_UNIT__CONTROL_PULSE_HIGH:
        case CimPackage.GENERATING_UNIT__CONTROL_PULSE_LOW:
        case CimPackage.GENERATING_UNIT__CONTROL_RESPONSE_RATE:
        case CimPackage.GENERATING_UNIT__EFFICIENCY:
        case CimPackage.GENERATING_UNIT__GEN_CONTROL_MODE:
        case CimPackage.GENERATING_UNIT__GEN_CONTROL_SOURCE:
        case CimPackage.GENERATING_UNIT__GOVERNOR_MPL:
        case CimPackage.GENERATING_UNIT__GOVERNOR_SCD:
        case CimPackage.GENERATING_UNIT__HIGH_CONTROL_LIMIT:
        case CimPackage.GENERATING_UNIT__INITIAL_P:
        case CimPackage.GENERATING_UNIT__LONG_PF:
        case CimPackage.GENERATING_UNIT__LOW_CONTROL_LIMIT:
        case CimPackage.GENERATING_UNIT__LOWER_RAMP_RATE:
        case CimPackage.GENERATING_UNIT__MAX_ECONOMIC_P:
        case CimPackage.GENERATING_UNIT__MAXIMUM_ALLOWABLE_SPINNING_RESERVE:
        case CimPackage.GENERATING_UNIT__MAX_OPERATING_P:
        case CimPackage.GENERATING_UNIT__MIN_ECONOMIC_P:
        case CimPackage.GENERATING_UNIT__MINIMUM_OFF_TIME:
        case CimPackage.GENERATING_UNIT__MIN_OPERATING_P:
        case CimPackage.GENERATING_UNIT__MODEL_DETAIL:
        case CimPackage.GENERATING_UNIT__NOMINAL_P:
        case CimPackage.GENERATING_UNIT__NORMAL_PF:
        case CimPackage.GENERATING_UNIT__PENALTY_FACTOR:
        case CimPackage.GENERATING_UNIT__RAISE_RAMP_RATE:
        case CimPackage.GENERATING_UNIT__RATED_GROSS_MAX_P:
        case CimPackage.GENERATING_UNIT__RATED_GROSS_MIN_P:
        case CimPackage.GENERATING_UNIT__RATED_NET_MAX_P:
        case CimPackage.GENERATING_UNIT__SHORT_PF:
        case CimPackage.GENERATING_UNIT__STARTUP_COST:
        case CimPackage.GENERATING_UNIT__STARTUP_TIME:
        case CimPackage.GENERATING_UNIT__TIE_LINE_PF:
        case CimPackage.GENERATING_UNIT__TOTAL_EFFICIENCY:
        case CimPackage.GENERATING_UNIT__VARIABLE_COST:
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
