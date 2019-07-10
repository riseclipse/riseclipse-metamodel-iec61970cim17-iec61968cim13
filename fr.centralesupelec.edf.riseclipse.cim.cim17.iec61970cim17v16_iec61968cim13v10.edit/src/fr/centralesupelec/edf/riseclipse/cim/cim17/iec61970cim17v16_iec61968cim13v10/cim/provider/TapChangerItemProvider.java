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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChanger;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChanger} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TapChangerItemProvider extends PowerSystemResourceItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TapChangerItemProvider( AdapterFactory adapterFactory ) {
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

            addControlEnabledPropertyDescriptor( object );
            addHighStepPropertyDescriptor( object );
            addInitialDelayPropertyDescriptor( object );
            addLowStepPropertyDescriptor( object );
            addLtcFlagPropertyDescriptor( object );
            addNeutralStepPropertyDescriptor( object );
            addNeutralUPropertyDescriptor( object );
            addNormalStepPropertyDescriptor( object );
            addStepPropertyDescriptor( object );
            addSubsequentDelayPropertyDescriptor( object );
            addSvTapStepPropertyDescriptor( object );
            addTapSchedulesPropertyDescriptor( object );
            addTapChangerControlPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Control Enabled feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addControlEnabledPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_TapChanger_controlEnabled_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_TapChanger_controlEnabled_feature",
                                "_UI_TapChanger_type" ),
                        CimPackage.eINSTANCE.getTapChanger_ControlEnabled(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the High Step feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addHighStepPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_TapChanger_highStep_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_TapChanger_highStep_feature",
                                "_UI_TapChanger_type" ),
                        CimPackage.eINSTANCE.getTapChanger_HighStep(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Initial Delay feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addInitialDelayPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_TapChanger_initialDelay_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_TapChanger_initialDelay_feature",
                                "_UI_TapChanger_type" ),
                        CimPackage.eINSTANCE.getTapChanger_InitialDelay(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Low Step feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLowStepPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_TapChanger_lowStep_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_TapChanger_lowStep_feature",
                                "_UI_TapChanger_type" ),
                        CimPackage.eINSTANCE.getTapChanger_LowStep(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Ltc Flag feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLtcFlagPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_TapChanger_ltcFlag_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_TapChanger_ltcFlag_feature",
                                "_UI_TapChanger_type" ),
                        CimPackage.eINSTANCE.getTapChanger_LtcFlag(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Neutral Step feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addNeutralStepPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_TapChanger_neutralStep_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_TapChanger_neutralStep_feature",
                                "_UI_TapChanger_type" ),
                        CimPackage.eINSTANCE.getTapChanger_NeutralStep(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Neutral U feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addNeutralUPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_TapChanger_neutralU_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_TapChanger_neutralU_feature",
                                "_UI_TapChanger_type" ),
                        CimPackage.eINSTANCE.getTapChanger_NeutralU(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Normal Step feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addNormalStepPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_TapChanger_normalStep_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_TapChanger_normalStep_feature",
                                "_UI_TapChanger_type" ),
                        CimPackage.eINSTANCE.getTapChanger_NormalStep(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Step feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addStepPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_TapChanger_step_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_TapChanger_step_feature",
                                "_UI_TapChanger_type" ),
                        CimPackage.eINSTANCE.getTapChanger_Step(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Subsequent Delay feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSubsequentDelayPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_TapChanger_subsequentDelay_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_TapChanger_subsequentDelay_feature",
                                "_UI_TapChanger_type" ),
                        CimPackage.eINSTANCE.getTapChanger_SubsequentDelay(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Sv Tap Step feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSvTapStepPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_TapChanger_SvTapStep_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_TapChanger_SvTapStep_feature",
                                "_UI_TapChanger_type" ),
                        CimPackage.eINSTANCE.getTapChanger_SvTapStep(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Tap Schedules feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTapSchedulesPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_TapChanger_TapSchedules_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_TapChanger_TapSchedules_feature",
                                "_UI_TapChanger_type" ),
                        CimPackage.eINSTANCE.getTapChanger_TapSchedules(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Tap Changer Control feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTapChangerControlPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_TapChanger_TapChangerControl_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_TapChanger_TapChangerControl_feature",
                                "_UI_TapChanger_type" ),
                        CimPackage.eINSTANCE.getTapChanger_TapChangerControl(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This returns TapChanger.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/TapChanger" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( TapChanger ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_TapChanger_type" )
                : getString( "_UI_TapChanger_type" ) + " " + label;
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

        switch( notification.getFeatureID( TapChanger.class ) ) {
        case CimPackage.TAP_CHANGER__CONTROL_ENABLED:
        case CimPackage.TAP_CHANGER__HIGH_STEP:
        case CimPackage.TAP_CHANGER__INITIAL_DELAY:
        case CimPackage.TAP_CHANGER__LOW_STEP:
        case CimPackage.TAP_CHANGER__LTC_FLAG:
        case CimPackage.TAP_CHANGER__NEUTRAL_STEP:
        case CimPackage.TAP_CHANGER__NEUTRAL_U:
        case CimPackage.TAP_CHANGER__NORMAL_STEP:
        case CimPackage.TAP_CHANGER__STEP:
        case CimPackage.TAP_CHANGER__SUBSEQUENT_DELAY:
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
