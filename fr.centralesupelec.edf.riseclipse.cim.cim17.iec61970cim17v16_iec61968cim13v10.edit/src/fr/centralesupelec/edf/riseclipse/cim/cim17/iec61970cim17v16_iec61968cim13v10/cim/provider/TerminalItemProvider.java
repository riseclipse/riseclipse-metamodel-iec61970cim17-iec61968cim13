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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Terminal;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Terminal} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TerminalItemProvider extends ACDCTerminalItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TerminalItemProvider( AdapterFactory adapterFactory ) {
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

            addPhasesPropertyDescriptor( object );
            addTopologicalNodePropertyDescriptor( object );
            addHasFirstMutualCouplingPropertyDescriptor( object );
            addConverterDCSidesPropertyDescriptor( object );
            addHasSecondMutualCouplingPropertyDescriptor( object );
            addBranchGroupTerminalPropertyDescriptor( object );
            addConductingEquipmentPropertyDescriptor( object );
            addConnectivityNodePropertyDescriptor( object );
            addRegulatingControlPropertyDescriptor( object );
            addRemoteInputSignalPropertyDescriptor( object );
            addSvPowerFlowPropertyDescriptor( object );
            addTransformerEndPropertyDescriptor( object );
            addAuxiliaryEquipmentPropertyDescriptor( object );
            addTieFlowPropertyDescriptor( object );
            addEquipmentFaultsPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Phases feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPhasesPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Terminal_phases_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Terminal_phases_feature",
                                "_UI_Terminal_type" ),
                        CimPackage.eINSTANCE.getTerminal_Phases(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Topological Node feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTopologicalNodePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Terminal_TopologicalNode_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Terminal_TopologicalNode_feature",
                                "_UI_Terminal_type" ),
                        CimPackage.eINSTANCE.getTerminal_TopologicalNode(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Has First Mutual Coupling feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addHasFirstMutualCouplingPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Terminal_HasFirstMutualCoupling_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Terminal_HasFirstMutualCoupling_feature",
                                "_UI_Terminal_type" ),
                        CimPackage.eINSTANCE.getTerminal_HasFirstMutualCoupling(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Converter DC Sides feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addConverterDCSidesPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Terminal_ConverterDCSides_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Terminal_ConverterDCSides_feature",
                                "_UI_Terminal_type" ),
                        CimPackage.eINSTANCE.getTerminal_ConverterDCSides(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Has Second Mutual Coupling feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addHasSecondMutualCouplingPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Terminal_HasSecondMutualCoupling_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Terminal_HasSecondMutualCoupling_feature",
                                "_UI_Terminal_type" ),
                        CimPackage.eINSTANCE.getTerminal_HasSecondMutualCoupling(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Branch Group Terminal feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addBranchGroupTerminalPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Terminal_BranchGroupTerminal_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Terminal_BranchGroupTerminal_feature",
                                "_UI_Terminal_type" ),
                        CimPackage.eINSTANCE.getTerminal_BranchGroupTerminal(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Conducting Equipment feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addConductingEquipmentPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Terminal_ConductingEquipment_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Terminal_ConductingEquipment_feature",
                                "_UI_Terminal_type" ),
                        CimPackage.eINSTANCE.getTerminal_ConductingEquipment(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Connectivity Node feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addConnectivityNodePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Terminal_ConnectivityNode_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Terminal_ConnectivityNode_feature",
                                "_UI_Terminal_type" ),
                        CimPackage.eINSTANCE.getTerminal_ConnectivityNode(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Regulating Control feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRegulatingControlPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Terminal_RegulatingControl_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Terminal_RegulatingControl_feature",
                                "_UI_Terminal_type" ),
                        CimPackage.eINSTANCE.getTerminal_RegulatingControl(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Remote Input Signal feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRemoteInputSignalPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Terminal_RemoteInputSignal_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Terminal_RemoteInputSignal_feature",
                                "_UI_Terminal_type" ),
                        CimPackage.eINSTANCE.getTerminal_RemoteInputSignal(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Sv Power Flow feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSvPowerFlowPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Terminal_SvPowerFlow_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Terminal_SvPowerFlow_feature",
                                "_UI_Terminal_type" ),
                        CimPackage.eINSTANCE.getTerminal_SvPowerFlow(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Transformer End feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTransformerEndPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Terminal_TransformerEnd_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Terminal_TransformerEnd_feature",
                                "_UI_Terminal_type" ),
                        CimPackage.eINSTANCE.getTerminal_TransformerEnd(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Auxiliary Equipment feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAuxiliaryEquipmentPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Terminal_AuxiliaryEquipment_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Terminal_AuxiliaryEquipment_feature",
                                "_UI_Terminal_type" ),
                        CimPackage.eINSTANCE.getTerminal_AuxiliaryEquipment(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Tie Flow feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTieFlowPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Terminal_TieFlow_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Terminal_TieFlow_feature",
                                "_UI_Terminal_type" ),
                        CimPackage.eINSTANCE.getTerminal_TieFlow(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Equipment Faults feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEquipmentFaultsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Terminal_EquipmentFaults_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Terminal_EquipmentFaults_feature",
                                "_UI_Terminal_type" ),
                        CimPackage.eINSTANCE.getTerminal_EquipmentFaults(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This returns Terminal.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/Terminal" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( Terminal ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_Terminal_type" )
                : getString( "_UI_Terminal_type" ) + " " + label;
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

        switch( notification.getFeatureID( Terminal.class ) ) {
        case CimPackage.TERMINAL__PHASES:
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
