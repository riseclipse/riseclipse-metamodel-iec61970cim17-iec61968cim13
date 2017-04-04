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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadResponseCharacteristic;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadResponseCharacteristic} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LoadResponseCharacteristicItemProvider extends IdentifiedObjectItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LoadResponseCharacteristicItemProvider( AdapterFactory adapterFactory ) {
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

            addExponentModelPropertyDescriptor( object );
            addPConstantCurrentPropertyDescriptor( object );
            addPConstantImpedancePropertyDescriptor( object );
            addPConstantPowerPropertyDescriptor( object );
            addPFrequencyExponentPropertyDescriptor( object );
            addPVoltageExponentPropertyDescriptor( object );
            addQConstantCurrentPropertyDescriptor( object );
            addQConstantImpedancePropertyDescriptor( object );
            addQConstantPowerPropertyDescriptor( object );
            addQFrequencyExponentPropertyDescriptor( object );
            addQVoltageExponentPropertyDescriptor( object );
            addEnergyConsumerPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Exponent Model feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addExponentModelPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_LoadResponseCharacteristic_exponentModel_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_LoadResponseCharacteristic_exponentModel_feature",
                        "_UI_LoadResponseCharacteristic_type" ),
                CimPackage.eINSTANCE.getLoadResponseCharacteristic_ExponentModel(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the PConstant Current feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPConstantCurrentPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_LoadResponseCharacteristic_pConstantCurrent_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_LoadResponseCharacteristic_pConstantCurrent_feature",
                                "_UI_LoadResponseCharacteristic_type" ),
                        CimPackage.eINSTANCE.getLoadResponseCharacteristic_PConstantCurrent(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the PConstant Impedance feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPConstantImpedancePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_LoadResponseCharacteristic_pConstantImpedance_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_LoadResponseCharacteristic_pConstantImpedance_feature",
                                "_UI_LoadResponseCharacteristic_type" ),
                        CimPackage.eINSTANCE.getLoadResponseCharacteristic_PConstantImpedance(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the PConstant Power feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPConstantPowerPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_LoadResponseCharacteristic_pConstantPower_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_LoadResponseCharacteristic_pConstantPower_feature",
                                "_UI_LoadResponseCharacteristic_type" ),
                        CimPackage.eINSTANCE.getLoadResponseCharacteristic_PConstantPower(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the PFrequency Exponent feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPFrequencyExponentPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_LoadResponseCharacteristic_pFrequencyExponent_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_LoadResponseCharacteristic_pFrequencyExponent_feature",
                                "_UI_LoadResponseCharacteristic_type" ),
                        CimPackage.eINSTANCE.getLoadResponseCharacteristic_PFrequencyExponent(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the PVoltage Exponent feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPVoltageExponentPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_LoadResponseCharacteristic_pVoltageExponent_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_LoadResponseCharacteristic_pVoltageExponent_feature",
                                "_UI_LoadResponseCharacteristic_type" ),
                        CimPackage.eINSTANCE.getLoadResponseCharacteristic_PVoltageExponent(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the QConstant Current feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addQConstantCurrentPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_LoadResponseCharacteristic_qConstantCurrent_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_LoadResponseCharacteristic_qConstantCurrent_feature",
                                "_UI_LoadResponseCharacteristic_type" ),
                        CimPackage.eINSTANCE.getLoadResponseCharacteristic_QConstantCurrent(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the QConstant Impedance feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addQConstantImpedancePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_LoadResponseCharacteristic_qConstantImpedance_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_LoadResponseCharacteristic_qConstantImpedance_feature",
                                "_UI_LoadResponseCharacteristic_type" ),
                        CimPackage.eINSTANCE.getLoadResponseCharacteristic_QConstantImpedance(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the QConstant Power feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addQConstantPowerPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_LoadResponseCharacteristic_qConstantPower_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_LoadResponseCharacteristic_qConstantPower_feature",
                                "_UI_LoadResponseCharacteristic_type" ),
                        CimPackage.eINSTANCE.getLoadResponseCharacteristic_QConstantPower(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the QFrequency Exponent feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addQFrequencyExponentPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_LoadResponseCharacteristic_qFrequencyExponent_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_LoadResponseCharacteristic_qFrequencyExponent_feature",
                                "_UI_LoadResponseCharacteristic_type" ),
                        CimPackage.eINSTANCE.getLoadResponseCharacteristic_QFrequencyExponent(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the QVoltage Exponent feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addQVoltageExponentPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_LoadResponseCharacteristic_qVoltageExponent_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_LoadResponseCharacteristic_qVoltageExponent_feature",
                                "_UI_LoadResponseCharacteristic_type" ),
                        CimPackage.eINSTANCE.getLoadResponseCharacteristic_QVoltageExponent(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Energy Consumer feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEnergyConsumerPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_LoadResponseCharacteristic_EnergyConsumer_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_LoadResponseCharacteristic_EnergyConsumer_feature",
                                "_UI_LoadResponseCharacteristic_type" ),
                        CimPackage.eINSTANCE.getLoadResponseCharacteristic_EnergyConsumer(), true, false, true, null,
                        null, null ) );
    }

    /**
     * This returns LoadResponseCharacteristic.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/LoadResponseCharacteristic" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( LoadResponseCharacteristic ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_LoadResponseCharacteristic_type" )
                : getString( "_UI_LoadResponseCharacteristic_type" ) + " " + label;
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

        switch( notification.getFeatureID( LoadResponseCharacteristic.class ) ) {
        case CimPackage.LOAD_RESPONSE_CHARACTERISTIC__EXPONENT_MODEL:
        case CimPackage.LOAD_RESPONSE_CHARACTERISTIC__PCONSTANT_CURRENT:
        case CimPackage.LOAD_RESPONSE_CHARACTERISTIC__PCONSTANT_IMPEDANCE:
        case CimPackage.LOAD_RESPONSE_CHARACTERISTIC__PCONSTANT_POWER:
        case CimPackage.LOAD_RESPONSE_CHARACTERISTIC__PFREQUENCY_EXPONENT:
        case CimPackage.LOAD_RESPONSE_CHARACTERISTIC__PVOLTAGE_EXPONENT:
        case CimPackage.LOAD_RESPONSE_CHARACTERISTIC__QCONSTANT_CURRENT:
        case CimPackage.LOAD_RESPONSE_CHARACTERISTIC__QCONSTANT_IMPEDANCE:
        case CimPackage.LOAD_RESPONSE_CHARACTERISTIC__QCONSTANT_POWER:
        case CimPackage.LOAD_RESPONSE_CHARACTERISTIC__QFREQUENCY_EXPONENT:
        case CimPackage.LOAD_RESPONSE_CHARACTERISTIC__QVOLTAGE_EXPONENT:
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
