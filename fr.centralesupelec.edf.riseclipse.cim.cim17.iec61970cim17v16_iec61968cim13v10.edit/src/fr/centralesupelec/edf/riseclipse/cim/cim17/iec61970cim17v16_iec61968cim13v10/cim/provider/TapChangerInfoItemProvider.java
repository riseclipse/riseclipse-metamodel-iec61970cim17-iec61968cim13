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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChangerInfo;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChangerInfo} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TapChangerInfoItemProvider extends AssetInfoItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TapChangerInfoItemProvider( AdapterFactory adapterFactory ) {
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

            addBilPropertyDescriptor( object );
            addCtRatingPropertyDescriptor( object );
            addCtRatioPropertyDescriptor( object );
            addFrequencyPropertyDescriptor( object );
            addHighStepPropertyDescriptor( object );
            addIsTculPropertyDescriptor( object );
            addLowStepPropertyDescriptor( object );
            addNeutralStepPropertyDescriptor( object );
            addNeutralUPropertyDescriptor( object );
            addPtRatioPropertyDescriptor( object );
            addRatedApparentPowerPropertyDescriptor( object );
            addRatedCurrentPropertyDescriptor( object );
            addRatedVoltagePropertyDescriptor( object );
            addStepPhaseIncrementPropertyDescriptor( object );
            addStepVoltageIncrementPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Bil feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addBilPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_TapChangerInfo_bil_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_TapChangerInfo_bil_feature",
                                "_UI_TapChangerInfo_type" ),
                        CimPackage.eINSTANCE.getTapChangerInfo_Bil(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Ct Rating feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCtRatingPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_TapChangerInfo_ctRating_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_TapChangerInfo_ctRating_feature",
                                "_UI_TapChangerInfo_type" ),
                        CimPackage.eINSTANCE.getTapChangerInfo_CtRating(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Ct Ratio feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCtRatioPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_TapChangerInfo_ctRatio_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_TapChangerInfo_ctRatio_feature",
                                "_UI_TapChangerInfo_type" ),
                        CimPackage.eINSTANCE.getTapChangerInfo_CtRatio(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Frequency feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFrequencyPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_TapChangerInfo_frequency_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_TapChangerInfo_frequency_feature",
                                "_UI_TapChangerInfo_type" ),
                        CimPackage.eINSTANCE.getTapChangerInfo_Frequency(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
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
                        getResourceLocator(), getString( "_UI_TapChangerInfo_highStep_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_TapChangerInfo_highStep_feature",
                                "_UI_TapChangerInfo_type" ),
                        CimPackage.eINSTANCE.getTapChangerInfo_HighStep(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Is Tcul feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIsTculPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_TapChangerInfo_isTcul_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_TapChangerInfo_isTcul_feature",
                                "_UI_TapChangerInfo_type" ),
                        CimPackage.eINSTANCE.getTapChangerInfo_IsTcul(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
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
                        getResourceLocator(), getString( "_UI_TapChangerInfo_lowStep_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_TapChangerInfo_lowStep_feature",
                                "_UI_TapChangerInfo_type" ),
                        CimPackage.eINSTANCE.getTapChangerInfo_LowStep(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
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
                        getResourceLocator(), getString( "_UI_TapChangerInfo_neutralStep_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_TapChangerInfo_neutralStep_feature",
                                "_UI_TapChangerInfo_type" ),
                        CimPackage.eINSTANCE.getTapChangerInfo_NeutralStep(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
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
                        getResourceLocator(), getString( "_UI_TapChangerInfo_neutralU_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_TapChangerInfo_neutralU_feature",
                                "_UI_TapChangerInfo_type" ),
                        CimPackage.eINSTANCE.getTapChangerInfo_NeutralU(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Pt Ratio feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPtRatioPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_TapChangerInfo_ptRatio_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_TapChangerInfo_ptRatio_feature",
                                "_UI_TapChangerInfo_type" ),
                        CimPackage.eINSTANCE.getTapChangerInfo_PtRatio(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Rated Apparent Power feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRatedApparentPowerPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_TapChangerInfo_ratedApparentPower_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_TapChangerInfo_ratedApparentPower_feature",
                        "_UI_TapChangerInfo_type" ),
                CimPackage.eINSTANCE.getTapChangerInfo_RatedApparentPower(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_TapChangerInfo_ratedCurrent_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_TapChangerInfo_ratedCurrent_feature",
                                "_UI_TapChangerInfo_type" ),
                        CimPackage.eINSTANCE.getTapChangerInfo_RatedCurrent(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_TapChangerInfo_ratedVoltage_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_TapChangerInfo_ratedVoltage_feature",
                                "_UI_TapChangerInfo_type" ),
                        CimPackage.eINSTANCE.getTapChangerInfo_RatedVoltage(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Step Phase Increment feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addStepPhaseIncrementPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_TapChangerInfo_stepPhaseIncrement_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_TapChangerInfo_stepPhaseIncrement_feature",
                        "_UI_TapChangerInfo_type" ),
                CimPackage.eINSTANCE.getTapChangerInfo_StepPhaseIncrement(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Step Voltage Increment feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addStepVoltageIncrementPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_TapChangerInfo_stepVoltageIncrement_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_TapChangerInfo_stepVoltageIncrement_feature",
                        "_UI_TapChangerInfo_type" ),
                CimPackage.eINSTANCE.getTapChangerInfo_StepVoltageIncrement(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This returns TapChangerInfo.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/TapChangerInfo" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( TapChangerInfo ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_TapChangerInfo_type" )
                : getString( "_UI_TapChangerInfo_type" ) + " " + label;
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

        switch( notification.getFeatureID( TapChangerInfo.class ) ) {
        case CimPackage.TAP_CHANGER_INFO__BIL:
        case CimPackage.TAP_CHANGER_INFO__CT_RATING:
        case CimPackage.TAP_CHANGER_INFO__CT_RATIO:
        case CimPackage.TAP_CHANGER_INFO__FREQUENCY:
        case CimPackage.TAP_CHANGER_INFO__HIGH_STEP:
        case CimPackage.TAP_CHANGER_INFO__IS_TCUL:
        case CimPackage.TAP_CHANGER_INFO__LOW_STEP:
        case CimPackage.TAP_CHANGER_INFO__NEUTRAL_STEP:
        case CimPackage.TAP_CHANGER_INFO__NEUTRAL_U:
        case CimPackage.TAP_CHANGER_INFO__PT_RATIO:
        case CimPackage.TAP_CHANGER_INFO__RATED_APPARENT_POWER:
        case CimPackage.TAP_CHANGER_INFO__RATED_CURRENT:
        case CimPackage.TAP_CHANGER_INFO__RATED_VOLTAGE:
        case CimPackage.TAP_CHANGER_INFO__STEP_PHASE_INCREMENT:
        case CimPackage.TAP_CHANGER_INFO__STEP_VOLTAGE_INCREMENT:
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
