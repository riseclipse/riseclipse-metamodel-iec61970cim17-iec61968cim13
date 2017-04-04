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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RegulatingControl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RegulatingControl} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RegulatingControlItemProvider extends PowerSystemResourceItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RegulatingControlItemProvider( AdapterFactory adapterFactory ) {
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

            addDiscretePropertyDescriptor( object );
            addEnabledPropertyDescriptor( object );
            addModePropertyDescriptor( object );
            addMonitoredPhasePropertyDescriptor( object );
            addTargetDeadbandPropertyDescriptor( object );
            addTargetValuePropertyDescriptor( object );
            addTargetValueUnitMultiplierPropertyDescriptor( object );
            addRegulatingCondEqPropertyDescriptor( object );
            addTerminalPropertyDescriptor( object );
            addRegulationSchedulePropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Discrete feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDiscretePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_RegulatingControl_discrete_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_RegulatingControl_discrete_feature",
                                "_UI_RegulatingControl_type" ),
                        CimPackage.eINSTANCE.getRegulatingControl_Discrete(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Enabled feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEnabledPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_RegulatingControl_enabled_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_RegulatingControl_enabled_feature",
                                "_UI_RegulatingControl_type" ),
                        CimPackage.eINSTANCE.getRegulatingControl_Enabled(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Mode feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addModePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_RegulatingControl_mode_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_RegulatingControl_mode_feature",
                                "_UI_RegulatingControl_type" ),
                        CimPackage.eINSTANCE.getRegulatingControl_Mode(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Monitored Phase feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMonitoredPhasePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_RegulatingControl_monitoredPhase_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_RegulatingControl_monitoredPhase_feature",
                        "_UI_RegulatingControl_type" ),
                CimPackage.eINSTANCE.getRegulatingControl_MonitoredPhase(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Target Deadband feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTargetDeadbandPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_RegulatingControl_targetDeadband_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_RegulatingControl_targetDeadband_feature",
                        "_UI_RegulatingControl_type" ),
                CimPackage.eINSTANCE.getRegulatingControl_TargetDeadband(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Target Value feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTargetValuePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_RegulatingControl_targetValue_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_RegulatingControl_targetValue_feature",
                                "_UI_RegulatingControl_type" ),
                        CimPackage.eINSTANCE.getRegulatingControl_TargetValue(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Target Value Unit Multiplier feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTargetValueUnitMultiplierPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_RegulatingControl_targetValueUnitMultiplier_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_RegulatingControl_targetValueUnitMultiplier_feature", "_UI_RegulatingControl_type" ),
                CimPackage.eINSTANCE.getRegulatingControl_TargetValueUnitMultiplier(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Regulating Cond Eq feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRegulatingCondEqPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_RegulatingControl_RegulatingCondEq_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_RegulatingControl_RegulatingCondEq_feature",
                        "_UI_RegulatingControl_type" ),
                CimPackage.eINSTANCE.getRegulatingControl_RegulatingCondEq(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Terminal feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTerminalPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_RegulatingControl_Terminal_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_RegulatingControl_Terminal_feature",
                                "_UI_RegulatingControl_type" ),
                        CimPackage.eINSTANCE.getRegulatingControl_Terminal(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Regulation Schedule feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRegulationSchedulePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_RegulatingControl_RegulationSchedule_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_RegulatingControl_RegulationSchedule_feature",
                        "_UI_RegulatingControl_type" ),
                CimPackage.eINSTANCE.getRegulatingControl_RegulationSchedule(), true, false, true, null, null, null ) );
    }

    /**
     * This returns RegulatingControl.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/RegulatingControl" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( RegulatingControl ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_RegulatingControl_type" )
                : getString( "_UI_RegulatingControl_type" ) + " " + label;
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

        switch( notification.getFeatureID( RegulatingControl.class ) ) {
        case CimPackage.REGULATING_CONTROL__DISCRETE:
        case CimPackage.REGULATING_CONTROL__ENABLED:
        case CimPackage.REGULATING_CONTROL__MODE:
        case CimPackage.REGULATING_CONTROL__MONITORED_PHASE:
        case CimPackage.REGULATING_CONTROL__TARGET_DEADBAND:
        case CimPackage.REGULATING_CONTROL__TARGET_VALUE:
        case CimPackage.REGULATING_CONTROL__TARGET_VALUE_UNIT_MULTIPLIER:
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
