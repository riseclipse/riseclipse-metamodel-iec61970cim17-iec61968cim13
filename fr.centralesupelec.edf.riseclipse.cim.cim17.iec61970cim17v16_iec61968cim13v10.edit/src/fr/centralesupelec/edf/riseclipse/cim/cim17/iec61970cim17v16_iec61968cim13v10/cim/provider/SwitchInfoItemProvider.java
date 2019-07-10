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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchInfo;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchInfo} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SwitchInfoItemProvider extends AssetInfoItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SwitchInfoItemProvider( AdapterFactory adapterFactory ) {
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

            addBreakingCapacityPropertyDescriptor( object );
            addGasWeightPerTankPropertyDescriptor( object );
            addIsSinglePhasePropertyDescriptor( object );
            addIsUngangedPropertyDescriptor( object );
            addLowPressureAlarmPropertyDescriptor( object );
            addLowPressureLockOutPropertyDescriptor( object );
            addOilVolumePerTankPropertyDescriptor( object );
            addRatedCurrentPropertyDescriptor( object );
            addRatedFrequencyPropertyDescriptor( object );
            addRatedImpulseWithstandVoltagePropertyDescriptor( object );
            addRatedInterruptingTimePropertyDescriptor( object );
            addRatedVoltagePropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Breaking Capacity feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addBreakingCapacityPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_SwitchInfo_breakingCapacity_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_SwitchInfo_breakingCapacity_feature",
                                "_UI_SwitchInfo_type" ),
                        CimPackage.eINSTANCE.getSwitchInfo_BreakingCapacity(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Gas Weight Per Tank feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addGasWeightPerTankPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_SwitchInfo_gasWeightPerTank_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_SwitchInfo_gasWeightPerTank_feature",
                                "_UI_SwitchInfo_type" ),
                        CimPackage.eINSTANCE.getSwitchInfo_GasWeightPerTank(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Is Single Phase feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIsSinglePhasePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_SwitchInfo_isSinglePhase_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_SwitchInfo_isSinglePhase_feature",
                                "_UI_SwitchInfo_type" ),
                        CimPackage.eINSTANCE.getSwitchInfo_IsSinglePhase(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Is Unganged feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIsUngangedPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_SwitchInfo_isUnganged_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_SwitchInfo_isUnganged_feature",
                                "_UI_SwitchInfo_type" ),
                        CimPackage.eINSTANCE.getSwitchInfo_IsUnganged(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Low Pressure Alarm feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLowPressureAlarmPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_SwitchInfo_lowPressureAlarm_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_SwitchInfo_lowPressureAlarm_feature",
                                "_UI_SwitchInfo_type" ),
                        CimPackage.eINSTANCE.getSwitchInfo_LowPressureAlarm(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Low Pressure Lock Out feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLowPressureLockOutPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_SwitchInfo_lowPressureLockOut_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_SwitchInfo_lowPressureLockOut_feature",
                                "_UI_SwitchInfo_type" ),
                        CimPackage.eINSTANCE.getSwitchInfo_LowPressureLockOut(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Oil Volume Per Tank feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addOilVolumePerTankPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_SwitchInfo_oilVolumePerTank_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_SwitchInfo_oilVolumePerTank_feature",
                                "_UI_SwitchInfo_type" ),
                        CimPackage.eINSTANCE.getSwitchInfo_OilVolumePerTank(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Rated Current feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRatedCurrentPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_SwitchInfo_ratedCurrent_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_SwitchInfo_ratedCurrent_feature",
                                "_UI_SwitchInfo_type" ),
                        CimPackage.eINSTANCE.getSwitchInfo_RatedCurrent(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Rated Frequency feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRatedFrequencyPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_SwitchInfo_ratedFrequency_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_SwitchInfo_ratedFrequency_feature",
                                "_UI_SwitchInfo_type" ),
                        CimPackage.eINSTANCE.getSwitchInfo_RatedFrequency(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Rated Impulse Withstand Voltage feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRatedImpulseWithstandVoltagePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_SwitchInfo_ratedImpulseWithstandVoltage_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_SwitchInfo_ratedImpulseWithstandVoltage_feature",
                        "_UI_SwitchInfo_type" ),
                CimPackage.eINSTANCE.getSwitchInfo_RatedImpulseWithstandVoltage(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Rated Interrupting Time feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRatedInterruptingTimePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_SwitchInfo_ratedInterruptingTime_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_SwitchInfo_ratedInterruptingTime_feature",
                                "_UI_SwitchInfo_type" ),
                        CimPackage.eINSTANCE.getSwitchInfo_RatedInterruptingTime(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Rated Voltage feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRatedVoltagePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_SwitchInfo_ratedVoltage_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_SwitchInfo_ratedVoltage_feature",
                                "_UI_SwitchInfo_type" ),
                        CimPackage.eINSTANCE.getSwitchInfo_RatedVoltage(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This returns SwitchInfo.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/SwitchInfo" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( SwitchInfo ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_SwitchInfo_type" )
                : getString( "_UI_SwitchInfo_type" ) + " " + label;
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

        switch( notification.getFeatureID( SwitchInfo.class ) ) {
        case CimPackage.SWITCH_INFO__BREAKING_CAPACITY:
        case CimPackage.SWITCH_INFO__GAS_WEIGHT_PER_TANK:
        case CimPackage.SWITCH_INFO__IS_SINGLE_PHASE:
        case CimPackage.SWITCH_INFO__IS_UNGANGED:
        case CimPackage.SWITCH_INFO__LOW_PRESSURE_ALARM:
        case CimPackage.SWITCH_INFO__LOW_PRESSURE_LOCK_OUT:
        case CimPackage.SWITCH_INFO__OIL_VOLUME_PER_TANK:
        case CimPackage.SWITCH_INFO__RATED_CURRENT:
        case CimPackage.SWITCH_INFO__RATED_FREQUENCY:
        case CimPackage.SWITCH_INFO__RATED_IMPULSE_WITHSTAND_VOLTAGE:
        case CimPackage.SWITCH_INFO__RATED_INTERRUPTING_TIME:
        case CimPackage.SWITCH_INFO__RATED_VOLTAGE:
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
