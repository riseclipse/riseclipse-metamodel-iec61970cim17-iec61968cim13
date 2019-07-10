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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindDynamicsLookupTable;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindDynamicsLookupTable} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class WindDynamicsLookupTableItemProvider extends IdentifiedObjectItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WindDynamicsLookupTableItemProvider( AdapterFactory adapterFactory ) {
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

            addInputPropertyDescriptor( object );
            addLookupTableFunctionTypePropertyDescriptor( object );
            addOutputPropertyDescriptor( object );
            addSequencePropertyDescriptor( object );
            addWindPlantFreqPcontrolIECPropertyDescriptor( object );
            addWindContRotorRIECPropertyDescriptor( object );
            addWindPlantReactiveControlIECPropertyDescriptor( object );
            addWindContQPQULimIECPropertyDescriptor( object );
            addWindContCurrLimIECPropertyDescriptor( object );
            addWindPitchContPowerIECPropertyDescriptor( object );
            addWindGenType3bIECPropertyDescriptor( object );
            addWindProtectionIECPropertyDescriptor( object );
            addWindContPType3IECPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Input feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addInputPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_WindDynamicsLookupTable_input_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindDynamicsLookupTable_input_feature",
                                "_UI_WindDynamicsLookupTable_type" ),
                        CimPackage.eINSTANCE.getWindDynamicsLookupTable_Input(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Lookup Table Function Type feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLookupTableFunctionTypePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_WindDynamicsLookupTable_lookupTableFunctionType_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_WindDynamicsLookupTable_lookupTableFunctionType_feature",
                                "_UI_WindDynamicsLookupTable_type" ),
                        CimPackage.eINSTANCE.getWindDynamicsLookupTable_LookupTableFunctionType(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Output feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addOutputPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_WindDynamicsLookupTable_output_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindDynamicsLookupTable_output_feature",
                                "_UI_WindDynamicsLookupTable_type" ),
                        CimPackage.eINSTANCE.getWindDynamicsLookupTable_Output(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Sequence feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSequencePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_WindDynamicsLookupTable_sequence_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindDynamicsLookupTable_sequence_feature",
                                "_UI_WindDynamicsLookupTable_type" ),
                        CimPackage.eINSTANCE.getWindDynamicsLookupTable_Sequence(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Wind Plant Freq Pcontrol IEC feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addWindPlantFreqPcontrolIECPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_WindDynamicsLookupTable_WindPlantFreqPcontrolIEC_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_WindDynamicsLookupTable_WindPlantFreqPcontrolIEC_feature",
                                "_UI_WindDynamicsLookupTable_type" ),
                        CimPackage.eINSTANCE.getWindDynamicsLookupTable_WindPlantFreqPcontrolIEC(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Wind Cont Rotor RIEC feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addWindContRotorRIECPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                getResourceLocator(),
                getString( "_UI_WindDynamicsLookupTable_WindContRotorRIEC_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_WindDynamicsLookupTable_WindContRotorRIEC_feature", "_UI_WindDynamicsLookupTable_type" ),
                CimPackage.eINSTANCE.getWindDynamicsLookupTable_WindContRotorRIEC(),
                true,
                false,
                true,
                null,
                null,
                null ) );
    }

    /**
     * This adds a property descriptor for the Wind Plant Reactive Control IEC feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addWindPlantReactiveControlIECPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_WindDynamicsLookupTable_WindPlantReactiveControlIEC_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_WindDynamicsLookupTable_WindPlantReactiveControlIEC_feature",
                                "_UI_WindDynamicsLookupTable_type" ),
                        CimPackage.eINSTANCE.getWindDynamicsLookupTable_WindPlantReactiveControlIEC(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Wind Cont QPQU Lim IEC feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addWindContQPQULimIECPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                getResourceLocator(),
                getString( "_UI_WindDynamicsLookupTable_WindContQPQULimIEC_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_WindDynamicsLookupTable_WindContQPQULimIEC_feature", "_UI_WindDynamicsLookupTable_type" ),
                CimPackage.eINSTANCE.getWindDynamicsLookupTable_WindContQPQULimIEC(),
                true,
                false,
                true,
                null,
                null,
                null ) );
    }

    /**
     * This adds a property descriptor for the Wind Cont Curr Lim IEC feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addWindContCurrLimIECPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                getResourceLocator(),
                getString( "_UI_WindDynamicsLookupTable_WindContCurrLimIEC_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_WindDynamicsLookupTable_WindContCurrLimIEC_feature", "_UI_WindDynamicsLookupTable_type" ),
                CimPackage.eINSTANCE.getWindDynamicsLookupTable_WindContCurrLimIEC(),
                true,
                false,
                true,
                null,
                null,
                null ) );
    }

    /**
     * This adds a property descriptor for the Wind Pitch Cont Power IEC feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addWindPitchContPowerIECPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_WindDynamicsLookupTable_WindPitchContPowerIEC_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_WindDynamicsLookupTable_WindPitchContPowerIEC_feature",
                                "_UI_WindDynamicsLookupTable_type" ),
                        CimPackage.eINSTANCE.getWindDynamicsLookupTable_WindPitchContPowerIEC(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Wind Gen Type3b IEC feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addWindGenType3bIECPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                getResourceLocator(),
                getString( "_UI_WindDynamicsLookupTable_WindGenType3bIEC_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_WindDynamicsLookupTable_WindGenType3bIEC_feature",
                        "_UI_WindDynamicsLookupTable_type" ),
                CimPackage.eINSTANCE.getWindDynamicsLookupTable_WindGenType3bIEC(),
                true,
                false,
                true,
                null,
                null,
                null ) );
    }

    /**
     * This adds a property descriptor for the Wind Protection IEC feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addWindProtectionIECPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                getResourceLocator(),
                getString( "_UI_WindDynamicsLookupTable_WindProtectionIEC_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_WindDynamicsLookupTable_WindProtectionIEC_feature", "_UI_WindDynamicsLookupTable_type" ),
                CimPackage.eINSTANCE.getWindDynamicsLookupTable_WindProtectionIEC(),
                true,
                false,
                true,
                null,
                null,
                null ) );
    }

    /**
     * This adds a property descriptor for the Wind Cont PType3 IEC feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addWindContPType3IECPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                getResourceLocator(),
                getString( "_UI_WindDynamicsLookupTable_WindContPType3IEC_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_WindDynamicsLookupTable_WindContPType3IEC_feature", "_UI_WindDynamicsLookupTable_type" ),
                CimPackage.eINSTANCE.getWindDynamicsLookupTable_WindContPType3IEC(),
                true,
                false,
                true,
                null,
                null,
                null ) );
    }

    /**
     * This returns WindDynamicsLookupTable.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/WindDynamicsLookupTable" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( WindDynamicsLookupTable ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_WindDynamicsLookupTable_type" )
                : getString( "_UI_WindDynamicsLookupTable_type" ) + " " + label;
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

        switch( notification.getFeatureID( WindDynamicsLookupTable.class ) ) {
        case CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__INPUT:
        case CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__LOOKUP_TABLE_FUNCTION_TYPE:
        case CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__OUTPUT:
        case CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__SEQUENCE:
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
