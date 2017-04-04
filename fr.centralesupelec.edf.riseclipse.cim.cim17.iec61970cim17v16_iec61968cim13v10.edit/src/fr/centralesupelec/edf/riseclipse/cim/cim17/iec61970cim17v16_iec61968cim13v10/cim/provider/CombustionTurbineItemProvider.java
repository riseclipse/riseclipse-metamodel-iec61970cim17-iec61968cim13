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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CombustionTurbine;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CombustionTurbine} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CombustionTurbineItemProvider extends PrimeMoverItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CombustionTurbineItemProvider( AdapterFactory adapterFactory ) {
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

            addAmbientTempPropertyDescriptor( object );
            addAuxPowerVersusFrequencyPropertyDescriptor( object );
            addAuxPowerVersusVoltagePropertyDescriptor( object );
            addCapabilityVersusFrequencyPropertyDescriptor( object );
            addHeatRecoveryFlagPropertyDescriptor( object );
            addPowerVariationByTempPropertyDescriptor( object );
            addReferenceTempPropertyDescriptor( object );
            addTimeConstantPropertyDescriptor( object );
            addCTTempActivePowerCurvePropertyDescriptor( object );
            addHeatRecoveryBoilerPropertyDescriptor( object );
            addAirCompressorPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Ambient Temp feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAmbientTempPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_CombustionTurbine_ambientTemp_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_CombustionTurbine_ambientTemp_feature",
                                "_UI_CombustionTurbine_type" ),
                        CimPackage.eINSTANCE.getCombustionTurbine_AmbientTemp(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Aux Power Versus Frequency feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAuxPowerVersusFrequencyPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_CombustionTurbine_auxPowerVersusFrequency_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_CombustionTurbine_auxPowerVersusFrequency_feature", "_UI_CombustionTurbine_type" ),
                        CimPackage.eINSTANCE.getCombustionTurbine_AuxPowerVersusFrequency(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Aux Power Versus Voltage feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAuxPowerVersusVoltagePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_CombustionTurbine_auxPowerVersusVoltage_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_CombustionTurbine_auxPowerVersusVoltage_feature", "_UI_CombustionTurbine_type" ),
                        CimPackage.eINSTANCE.getCombustionTurbine_AuxPowerVersusVoltage(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Capability Versus Frequency feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCapabilityVersusFrequencyPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_CombustionTurbine_capabilityVersusFrequency_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_CombustionTurbine_capabilityVersusFrequency_feature", "_UI_CombustionTurbine_type" ),
                CimPackage.eINSTANCE.getCombustionTurbine_CapabilityVersusFrequency(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Heat Recovery Flag feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addHeatRecoveryFlagPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_CombustionTurbine_heatRecoveryFlag_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_CombustionTurbine_heatRecoveryFlag_feature",
                        "_UI_CombustionTurbine_type" ),
                CimPackage.eINSTANCE.getCombustionTurbine_HeatRecoveryFlag(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Power Variation By Temp feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPowerVariationByTempPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_CombustionTurbine_powerVariationByTemp_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_CombustionTurbine_powerVariationByTemp_feature", "_UI_CombustionTurbine_type" ),
                        CimPackage.eINSTANCE.getCombustionTurbine_PowerVariationByTemp(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Reference Temp feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addReferenceTempPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_CombustionTurbine_referenceTemp_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_CombustionTurbine_referenceTemp_feature",
                        "_UI_CombustionTurbine_type" ),
                CimPackage.eINSTANCE.getCombustionTurbine_ReferenceTemp(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Time Constant feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTimeConstantPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_CombustionTurbine_timeConstant_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_CombustionTurbine_timeConstant_feature",
                        "_UI_CombustionTurbine_type" ),
                CimPackage.eINSTANCE.getCombustionTurbine_TimeConstant(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the CT Temp Active Power Curve feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCTTempActivePowerCurvePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_CombustionTurbine_CTTempActivePowerCurve_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_CombustionTurbine_CTTempActivePowerCurve_feature", "_UI_CombustionTurbine_type" ),
                        CimPackage.eINSTANCE.getCombustionTurbine_CTTempActivePowerCurve(), true, false, true, null,
                        null, null ) );
    }

    /**
     * This adds a property descriptor for the Heat Recovery Boiler feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addHeatRecoveryBoilerPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_CombustionTurbine_HeatRecoveryBoiler_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_CombustionTurbine_HeatRecoveryBoiler_feature",
                        "_UI_CombustionTurbine_type" ),
                CimPackage.eINSTANCE.getCombustionTurbine_HeatRecoveryBoiler(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Air Compressor feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAirCompressorPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_CombustionTurbine_AirCompressor_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_CombustionTurbine_AirCompressor_feature",
                        "_UI_CombustionTurbine_type" ),
                CimPackage.eINSTANCE.getCombustionTurbine_AirCompressor(), true, false, true, null, null, null ) );
    }

    /**
     * This returns CombustionTurbine.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/CombustionTurbine" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( CombustionTurbine ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_CombustionTurbine_type" )
                : getString( "_UI_CombustionTurbine_type" ) + " " + label;
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

        switch( notification.getFeatureID( CombustionTurbine.class ) ) {
        case CimPackage.COMBUSTION_TURBINE__AMBIENT_TEMP:
        case CimPackage.COMBUSTION_TURBINE__AUX_POWER_VERSUS_FREQUENCY:
        case CimPackage.COMBUSTION_TURBINE__AUX_POWER_VERSUS_VOLTAGE:
        case CimPackage.COMBUSTION_TURBINE__CAPABILITY_VERSUS_FREQUENCY:
        case CimPackage.COMBUSTION_TURBINE__HEAT_RECOVERY_FLAG:
        case CimPackage.COMBUSTION_TURBINE__POWER_VARIATION_BY_TEMP:
        case CimPackage.COMBUSTION_TURBINE__REFERENCE_TEMP:
        case CimPackage.COMBUSTION_TURBINE__TIME_CONSTANT:
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
