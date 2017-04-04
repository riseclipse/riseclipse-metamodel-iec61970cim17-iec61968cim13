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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PWRSteamSupply;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PWRSteamSupply} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PWRSteamSupplyItemProvider extends SteamSupplyItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PWRSteamSupplyItemProvider( AdapterFactory adapterFactory ) {
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

            addColdLegFBLagTCPropertyDescriptor( object );
            addColdLegFBLeadTC1PropertyDescriptor( object );
            addColdLegFBLeadTC2PropertyDescriptor( object );
            addColdLegFG1PropertyDescriptor( object );
            addColdLegFG2PropertyDescriptor( object );
            addColdLegLagTCPropertyDescriptor( object );
            addCoreHTLagTC1PropertyDescriptor( object );
            addCoreHTLagTC2PropertyDescriptor( object );
            addCoreNeutronicsEffTCPropertyDescriptor( object );
            addCoreNeutronicsHTPropertyDescriptor( object );
            addFeedbackFactorPropertyDescriptor( object );
            addHotLegLagTCPropertyDescriptor( object );
            addHotLegSteamGainPropertyDescriptor( object );
            addHotLegToColdLegGainPropertyDescriptor( object );
            addPressureCGPropertyDescriptor( object );
            addSteamFlowFGPropertyDescriptor( object );
            addSteamPressureDropLagTCPropertyDescriptor( object );
            addSteamPressureFGPropertyDescriptor( object );
            addThrottlePressureFactorPropertyDescriptor( object );
            addThrottlePressureSPPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Cold Leg FB Lag TC feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addColdLegFBLagTCPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PWRSteamSupply_coldLegFBLagTC_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PWRSteamSupply_coldLegFBLagTC_feature",
                                "_UI_PWRSteamSupply_type" ),
                        CimPackage.eINSTANCE.getPWRSteamSupply_ColdLegFBLagTC(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Cold Leg FB Lead TC1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addColdLegFBLeadTC1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PWRSteamSupply_coldLegFBLeadTC1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PWRSteamSupply_coldLegFBLeadTC1_feature",
                                "_UI_PWRSteamSupply_type" ),
                        CimPackage.eINSTANCE.getPWRSteamSupply_ColdLegFBLeadTC1(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Cold Leg FB Lead TC2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addColdLegFBLeadTC2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PWRSteamSupply_coldLegFBLeadTC2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PWRSteamSupply_coldLegFBLeadTC2_feature",
                                "_UI_PWRSteamSupply_type" ),
                        CimPackage.eINSTANCE.getPWRSteamSupply_ColdLegFBLeadTC2(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Cold Leg FG1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addColdLegFG1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PWRSteamSupply_coldLegFG1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PWRSteamSupply_coldLegFG1_feature",
                                "_UI_PWRSteamSupply_type" ),
                        CimPackage.eINSTANCE.getPWRSteamSupply_ColdLegFG1(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Cold Leg FG2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addColdLegFG2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PWRSteamSupply_coldLegFG2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PWRSteamSupply_coldLegFG2_feature",
                                "_UI_PWRSteamSupply_type" ),
                        CimPackage.eINSTANCE.getPWRSteamSupply_ColdLegFG2(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Cold Leg Lag TC feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addColdLegLagTCPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PWRSteamSupply_coldLegLagTC_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PWRSteamSupply_coldLegLagTC_feature",
                                "_UI_PWRSteamSupply_type" ),
                        CimPackage.eINSTANCE.getPWRSteamSupply_ColdLegLagTC(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Core HT Lag TC1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCoreHTLagTC1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PWRSteamSupply_coreHTLagTC1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PWRSteamSupply_coreHTLagTC1_feature",
                                "_UI_PWRSteamSupply_type" ),
                        CimPackage.eINSTANCE.getPWRSteamSupply_CoreHTLagTC1(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Core HT Lag TC2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCoreHTLagTC2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PWRSteamSupply_coreHTLagTC2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PWRSteamSupply_coreHTLagTC2_feature",
                                "_UI_PWRSteamSupply_type" ),
                        CimPackage.eINSTANCE.getPWRSteamSupply_CoreHTLagTC2(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Core Neutronics Eff TC feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCoreNeutronicsEffTCPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_PWRSteamSupply_coreNeutronicsEffTC_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_PWRSteamSupply_coreNeutronicsEffTC_feature",
                        "_UI_PWRSteamSupply_type" ),
                CimPackage.eINSTANCE.getPWRSteamSupply_CoreNeutronicsEffTC(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Core Neutronics HT feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCoreNeutronicsHTPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PWRSteamSupply_coreNeutronicsHT_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PWRSteamSupply_coreNeutronicsHT_feature",
                                "_UI_PWRSteamSupply_type" ),
                        CimPackage.eINSTANCE.getPWRSteamSupply_CoreNeutronicsHT(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Feedback Factor feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFeedbackFactorPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PWRSteamSupply_feedbackFactor_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PWRSteamSupply_feedbackFactor_feature",
                                "_UI_PWRSteamSupply_type" ),
                        CimPackage.eINSTANCE.getPWRSteamSupply_FeedbackFactor(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Hot Leg Lag TC feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addHotLegLagTCPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PWRSteamSupply_hotLegLagTC_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PWRSteamSupply_hotLegLagTC_feature",
                                "_UI_PWRSteamSupply_type" ),
                        CimPackage.eINSTANCE.getPWRSteamSupply_HotLegLagTC(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Hot Leg Steam Gain feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addHotLegSteamGainPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PWRSteamSupply_hotLegSteamGain_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PWRSteamSupply_hotLegSteamGain_feature",
                                "_UI_PWRSteamSupply_type" ),
                        CimPackage.eINSTANCE.getPWRSteamSupply_HotLegSteamGain(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Hot Leg To Cold Leg Gain feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addHotLegToColdLegGainPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_PWRSteamSupply_hotLegToColdLegGain_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_PWRSteamSupply_hotLegToColdLegGain_feature",
                        "_UI_PWRSteamSupply_type" ),
                CimPackage.eINSTANCE.getPWRSteamSupply_HotLegToColdLegGain(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Pressure CG feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPressureCGPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PWRSteamSupply_pressureCG_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PWRSteamSupply_pressureCG_feature",
                                "_UI_PWRSteamSupply_type" ),
                        CimPackage.eINSTANCE.getPWRSteamSupply_PressureCG(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Steam Flow FG feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSteamFlowFGPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PWRSteamSupply_steamFlowFG_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PWRSteamSupply_steamFlowFG_feature",
                                "_UI_PWRSteamSupply_type" ),
                        CimPackage.eINSTANCE.getPWRSteamSupply_SteamFlowFG(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Steam Pressure Drop Lag TC feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSteamPressureDropLagTCPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_PWRSteamSupply_steamPressureDropLagTC_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_PWRSteamSupply_steamPressureDropLagTC_feature",
                        "_UI_PWRSteamSupply_type" ),
                CimPackage.eINSTANCE.getPWRSteamSupply_SteamPressureDropLagTC(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Steam Pressure FG feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSteamPressureFGPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PWRSteamSupply_steamPressureFG_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PWRSteamSupply_steamPressureFG_feature",
                                "_UI_PWRSteamSupply_type" ),
                        CimPackage.eINSTANCE.getPWRSteamSupply_SteamPressureFG(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Throttle Pressure Factor feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addThrottlePressureFactorPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_PWRSteamSupply_throttlePressureFactor_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_PWRSteamSupply_throttlePressureFactor_feature",
                        "_UI_PWRSteamSupply_type" ),
                CimPackage.eINSTANCE.getPWRSteamSupply_ThrottlePressureFactor(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Throttle Pressure SP feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addThrottlePressureSPPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_PWRSteamSupply_throttlePressureSP_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_PWRSteamSupply_throttlePressureSP_feature",
                        "_UI_PWRSteamSupply_type" ),
                CimPackage.eINSTANCE.getPWRSteamSupply_ThrottlePressureSP(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This returns PWRSteamSupply.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/PWRSteamSupply" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( PWRSteamSupply ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_PWRSteamSupply_type" )
                : getString( "_UI_PWRSteamSupply_type" ) + " " + label;
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

        switch( notification.getFeatureID( PWRSteamSupply.class ) ) {
        case CimPackage.PWR_STEAM_SUPPLY__COLD_LEG_FB_LAG_TC:
        case CimPackage.PWR_STEAM_SUPPLY__COLD_LEG_FB_LEAD_TC1:
        case CimPackage.PWR_STEAM_SUPPLY__COLD_LEG_FB_LEAD_TC2:
        case CimPackage.PWR_STEAM_SUPPLY__COLD_LEG_FG1:
        case CimPackage.PWR_STEAM_SUPPLY__COLD_LEG_FG2:
        case CimPackage.PWR_STEAM_SUPPLY__COLD_LEG_LAG_TC:
        case CimPackage.PWR_STEAM_SUPPLY__CORE_HT_LAG_TC1:
        case CimPackage.PWR_STEAM_SUPPLY__CORE_HT_LAG_TC2:
        case CimPackage.PWR_STEAM_SUPPLY__CORE_NEUTRONICS_EFF_TC:
        case CimPackage.PWR_STEAM_SUPPLY__CORE_NEUTRONICS_HT:
        case CimPackage.PWR_STEAM_SUPPLY__FEEDBACK_FACTOR:
        case CimPackage.PWR_STEAM_SUPPLY__HOT_LEG_LAG_TC:
        case CimPackage.PWR_STEAM_SUPPLY__HOT_LEG_STEAM_GAIN:
        case CimPackage.PWR_STEAM_SUPPLY__HOT_LEG_TO_COLD_LEG_GAIN:
        case CimPackage.PWR_STEAM_SUPPLY__PRESSURE_CG:
        case CimPackage.PWR_STEAM_SUPPLY__STEAM_FLOW_FG:
        case CimPackage.PWR_STEAM_SUPPLY__STEAM_PRESSURE_DROP_LAG_TC:
        case CimPackage.PWR_STEAM_SUPPLY__STEAM_PRESSURE_FG:
        case CimPackage.PWR_STEAM_SUPPLY__THROTTLE_PRESSURE_FACTOR:
        case CimPackage.PWR_STEAM_SUPPLY__THROTTLE_PRESSURE_SP:
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
