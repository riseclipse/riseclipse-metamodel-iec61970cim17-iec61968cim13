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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ACDCConverter;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ACDCConverter} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ACDCConverterItemProvider extends ConductingEquipmentItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ACDCConverterItemProvider( AdapterFactory adapterFactory ) {
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

            addBaseSPropertyDescriptor( object );
            addIdcPropertyDescriptor( object );
            addIdleLossPropertyDescriptor( object );
            addMaxUdcPropertyDescriptor( object );
            addMinUdcPropertyDescriptor( object );
            addNumberOfValvesPropertyDescriptor( object );
            addPPropertyDescriptor( object );
            addPoleLossPPropertyDescriptor( object );
            addQPropertyDescriptor( object );
            addRatedUdcPropertyDescriptor( object );
            addResistiveLossPropertyDescriptor( object );
            addSwitchingLossPropertyDescriptor( object );
            addTargetPpccPropertyDescriptor( object );
            addTargetUdcPropertyDescriptor( object );
            addUcPropertyDescriptor( object );
            addUdcPropertyDescriptor( object );
            addValveU0PropertyDescriptor( object );
            addDCTerminalsPropertyDescriptor( object );
            addPccTerminalPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Base S feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addBaseSPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ACDCConverter_baseS_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ACDCConverter_baseS_feature",
                                "_UI_ACDCConverter_type" ),
                        CimPackage.eINSTANCE.getACDCConverter_BaseS(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Idc feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIdcPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ACDCConverter_idc_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ACDCConverter_idc_feature",
                                "_UI_ACDCConverter_type" ),
                        CimPackage.eINSTANCE.getACDCConverter_Idc(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Idle Loss feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIdleLossPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ACDCConverter_idleLoss_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ACDCConverter_idleLoss_feature",
                                "_UI_ACDCConverter_type" ),
                        CimPackage.eINSTANCE.getACDCConverter_IdleLoss(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Max Udc feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMaxUdcPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ACDCConverter_maxUdc_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ACDCConverter_maxUdc_feature",
                                "_UI_ACDCConverter_type" ),
                        CimPackage.eINSTANCE.getACDCConverter_MaxUdc(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Min Udc feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMinUdcPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ACDCConverter_minUdc_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ACDCConverter_minUdc_feature",
                                "_UI_ACDCConverter_type" ),
                        CimPackage.eINSTANCE.getACDCConverter_MinUdc(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Number Of Valves feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addNumberOfValvesPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ACDCConverter_numberOfValves_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ACDCConverter_numberOfValves_feature",
                                "_UI_ACDCConverter_type" ),
                        CimPackage.eINSTANCE.getACDCConverter_NumberOfValves(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the P feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ACDCConverter_p_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ACDCConverter_p_feature",
                                "_UI_ACDCConverter_type" ),
                        CimPackage.eINSTANCE.getACDCConverter_P(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Pole Loss P feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPoleLossPPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ACDCConverter_poleLossP_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ACDCConverter_poleLossP_feature",
                                "_UI_ACDCConverter_type" ),
                        CimPackage.eINSTANCE.getACDCConverter_PoleLossP(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Q feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addQPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ACDCConverter_q_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ACDCConverter_q_feature",
                                "_UI_ACDCConverter_type" ),
                        CimPackage.eINSTANCE.getACDCConverter_Q(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Rated Udc feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRatedUdcPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ACDCConverter_ratedUdc_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ACDCConverter_ratedUdc_feature",
                                "_UI_ACDCConverter_type" ),
                        CimPackage.eINSTANCE.getACDCConverter_RatedUdc(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Resistive Loss feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addResistiveLossPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ACDCConverter_resistiveLoss_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ACDCConverter_resistiveLoss_feature",
                                "_UI_ACDCConverter_type" ),
                        CimPackage.eINSTANCE.getACDCConverter_ResistiveLoss(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Switching Loss feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSwitchingLossPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ACDCConverter_switchingLoss_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ACDCConverter_switchingLoss_feature",
                                "_UI_ACDCConverter_type" ),
                        CimPackage.eINSTANCE.getACDCConverter_SwitchingLoss(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Target Ppcc feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTargetPpccPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ACDCConverter_targetPpcc_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ACDCConverter_targetPpcc_feature",
                                "_UI_ACDCConverter_type" ),
                        CimPackage.eINSTANCE.getACDCConverter_TargetPpcc(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Target Udc feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTargetUdcPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ACDCConverter_targetUdc_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ACDCConverter_targetUdc_feature",
                                "_UI_ACDCConverter_type" ),
                        CimPackage.eINSTANCE.getACDCConverter_TargetUdc(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Uc feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUcPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ACDCConverter_uc_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ACDCConverter_uc_feature",
                                "_UI_ACDCConverter_type" ),
                        CimPackage.eINSTANCE.getACDCConverter_Uc(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Udc feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUdcPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ACDCConverter_udc_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ACDCConverter_udc_feature",
                                "_UI_ACDCConverter_type" ),
                        CimPackage.eINSTANCE.getACDCConverter_Udc(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Valve U0 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addValveU0PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ACDCConverter_valveU0_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ACDCConverter_valveU0_feature",
                                "_UI_ACDCConverter_type" ),
                        CimPackage.eINSTANCE.getACDCConverter_ValveU0(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the DC Terminals feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDCTerminalsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ACDCConverter_DCTerminals_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ACDCConverter_DCTerminals_feature",
                                "_UI_ACDCConverter_type" ),
                        CimPackage.eINSTANCE.getACDCConverter_DCTerminals(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Pcc Terminal feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPccTerminalPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ACDCConverter_PccTerminal_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ACDCConverter_PccTerminal_feature",
                                "_UI_ACDCConverter_type" ),
                        CimPackage.eINSTANCE.getACDCConverter_PccTerminal(), true, false, true, null, null, null ) );
    }

    /**
     * This returns ACDCConverter.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/ACDCConverter" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( ACDCConverter ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_ACDCConverter_type" )
                : getString( "_UI_ACDCConverter_type" ) + " " + label;
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

        switch( notification.getFeatureID( ACDCConverter.class ) ) {
        case CimPackage.ACDC_CONVERTER__BASE_S:
        case CimPackage.ACDC_CONVERTER__IDC:
        case CimPackage.ACDC_CONVERTER__IDLE_LOSS:
        case CimPackage.ACDC_CONVERTER__MAX_UDC:
        case CimPackage.ACDC_CONVERTER__MIN_UDC:
        case CimPackage.ACDC_CONVERTER__NUMBER_OF_VALVES:
        case CimPackage.ACDC_CONVERTER__P:
        case CimPackage.ACDC_CONVERTER__POLE_LOSS_P:
        case CimPackage.ACDC_CONVERTER__Q:
        case CimPackage.ACDC_CONVERTER__RATED_UDC:
        case CimPackage.ACDC_CONVERTER__RESISTIVE_LOSS:
        case CimPackage.ACDC_CONVERTER__SWITCHING_LOSS:
        case CimPackage.ACDC_CONVERTER__TARGET_PPCC:
        case CimPackage.ACDC_CONVERTER__TARGET_UDC:
        case CimPackage.ACDC_CONVERTER__UC:
        case CimPackage.ACDC_CONVERTER__UDC:
        case CimPackage.ACDC_CONVERTER__VALVE_U0:
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
