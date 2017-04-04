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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HeatInputCurve;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HeatInputCurve} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class HeatInputCurveItemProvider extends CurveItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public HeatInputCurveItemProvider( AdapterFactory adapterFactory ) {
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

            addAuxPowerMultPropertyDescriptor( object );
            addAuxPowerOffsetPropertyDescriptor( object );
            addHeatInputEffPropertyDescriptor( object );
            addHeatInputOffsetPropertyDescriptor( object );
            addIsNetGrossPPropertyDescriptor( object );
            addThermalGeneratingUnitPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Aux Power Mult feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAuxPowerMultPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_HeatInputCurve_auxPowerMult_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_HeatInputCurve_auxPowerMult_feature",
                                "_UI_HeatInputCurve_type" ),
                        CimPackage.eINSTANCE.getHeatInputCurve_AuxPowerMult(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Aux Power Offset feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAuxPowerOffsetPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_HeatInputCurve_auxPowerOffset_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_HeatInputCurve_auxPowerOffset_feature",
                                "_UI_HeatInputCurve_type" ),
                        CimPackage.eINSTANCE.getHeatInputCurve_AuxPowerOffset(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Heat Input Eff feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addHeatInputEffPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_HeatInputCurve_heatInputEff_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_HeatInputCurve_heatInputEff_feature",
                                "_UI_HeatInputCurve_type" ),
                        CimPackage.eINSTANCE.getHeatInputCurve_HeatInputEff(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Heat Input Offset feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addHeatInputOffsetPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_HeatInputCurve_heatInputOffset_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_HeatInputCurve_heatInputOffset_feature",
                                "_UI_HeatInputCurve_type" ),
                        CimPackage.eINSTANCE.getHeatInputCurve_HeatInputOffset(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Is Net Gross P feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIsNetGrossPPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_HeatInputCurve_isNetGrossP_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_HeatInputCurve_isNetGrossP_feature",
                                "_UI_HeatInputCurve_type" ),
                        CimPackage.eINSTANCE.getHeatInputCurve_IsNetGrossP(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Thermal Generating Unit feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addThermalGeneratingUnitPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_HeatInputCurve_ThermalGeneratingUnit_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_HeatInputCurve_ThermalGeneratingUnit_feature",
                        "_UI_HeatInputCurve_type" ),
                CimPackage.eINSTANCE.getHeatInputCurve_ThermalGeneratingUnit(), true, false, true, null, null, null ) );
    }

    /**
     * This returns HeatInputCurve.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/HeatInputCurve" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( HeatInputCurve ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_HeatInputCurve_type" )
                : getString( "_UI_HeatInputCurve_type" ) + " " + label;
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

        switch( notification.getFeatureID( HeatInputCurve.class ) ) {
        case CimPackage.HEAT_INPUT_CURVE__AUX_POWER_MULT:
        case CimPackage.HEAT_INPUT_CURVE__AUX_POWER_OFFSET:
        case CimPackage.HEAT_INPUT_CURVE__HEAT_INPUT_EFF:
        case CimPackage.HEAT_INPUT_CURVE__HEAT_INPUT_OFFSET:
        case CimPackage.HEAT_INPUT_CURVE__IS_NET_GROSS_P:
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
