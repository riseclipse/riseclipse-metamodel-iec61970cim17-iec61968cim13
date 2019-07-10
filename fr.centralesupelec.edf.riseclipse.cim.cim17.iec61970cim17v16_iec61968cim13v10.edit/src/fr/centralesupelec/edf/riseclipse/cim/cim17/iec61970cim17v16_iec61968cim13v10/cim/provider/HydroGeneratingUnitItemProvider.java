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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroGeneratingUnit;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroGeneratingUnit} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class HydroGeneratingUnitItemProvider extends GeneratingUnitItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public HydroGeneratingUnitItemProvider( AdapterFactory adapterFactory ) {
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

            addEnergyConversionCapabilityPropertyDescriptor( object );
            addHydroUnitWaterCostPropertyDescriptor( object );
            addHydroPowerPlantPropertyDescriptor( object );
            addPenstockLossCurvePropertyDescriptor( object );
            addHydroGeneratingEfficiencyCurvesPropertyDescriptor( object );
            addTailbayLossCurvePropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Energy Conversion Capability feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEnergyConversionCapabilityPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                getResourceLocator(),
                getString( "_UI_HydroGeneratingUnit_energyConversionCapability_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_HydroGeneratingUnit_energyConversionCapability_feature", "_UI_HydroGeneratingUnit_type" ),
                CimPackage.eINSTANCE.getHydroGeneratingUnit_EnergyConversionCapability(),
                true,
                false,
                false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                null,
                null ) );
    }

    /**
     * This adds a property descriptor for the Hydro Unit Water Cost feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addHydroUnitWaterCostPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_HydroGeneratingUnit_hydroUnitWaterCost_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_HydroGeneratingUnit_hydroUnitWaterCost_feature", "_UI_HydroGeneratingUnit_type" ),
                        CimPackage.eINSTANCE.getHydroGeneratingUnit_HydroUnitWaterCost(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Hydro Power Plant feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addHydroPowerPlantPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_HydroGeneratingUnit_HydroPowerPlant_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_HydroGeneratingUnit_HydroPowerPlant_feature", "_UI_HydroGeneratingUnit_type" ),
                        CimPackage.eINSTANCE.getHydroGeneratingUnit_HydroPowerPlant(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Penstock Loss Curve feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPenstockLossCurvePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_HydroGeneratingUnit_PenstockLossCurve_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_HydroGeneratingUnit_PenstockLossCurve_feature", "_UI_HydroGeneratingUnit_type" ),
                        CimPackage.eINSTANCE.getHydroGeneratingUnit_PenstockLossCurve(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Hydro Generating Efficiency Curves feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addHydroGeneratingEfficiencyCurvesPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_HydroGeneratingUnit_HydroGeneratingEfficiencyCurves_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_HydroGeneratingUnit_HydroGeneratingEfficiencyCurves_feature",
                                "_UI_HydroGeneratingUnit_type" ),
                        CimPackage.eINSTANCE.getHydroGeneratingUnit_HydroGeneratingEfficiencyCurves(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Tailbay Loss Curve feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTailbayLossCurvePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_HydroGeneratingUnit_TailbayLossCurve_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_HydroGeneratingUnit_TailbayLossCurve_feature", "_UI_HydroGeneratingUnit_type" ),
                        CimPackage.eINSTANCE.getHydroGeneratingUnit_TailbayLossCurve(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This returns HydroGeneratingUnit.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/HydroGeneratingUnit" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( HydroGeneratingUnit ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_HydroGeneratingUnit_type" )
                : getString( "_UI_HydroGeneratingUnit_type" ) + " " + label;
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

        switch( notification.getFeatureID( HydroGeneratingUnit.class ) ) {
        case CimPackage.HYDRO_GENERATING_UNIT__ENERGY_CONVERSION_CAPABILITY:
        case CimPackage.HYDRO_GENERATING_UNIT__HYDRO_UNIT_WATER_COST:
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
