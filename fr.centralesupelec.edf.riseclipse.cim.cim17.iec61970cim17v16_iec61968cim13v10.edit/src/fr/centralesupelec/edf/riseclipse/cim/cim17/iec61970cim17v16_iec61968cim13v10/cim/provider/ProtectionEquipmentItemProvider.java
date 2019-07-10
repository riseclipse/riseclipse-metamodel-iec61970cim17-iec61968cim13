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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProtectionEquipment;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProtectionEquipment} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ProtectionEquipmentItemProvider extends EquipmentItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ProtectionEquipmentItemProvider( AdapterFactory adapterFactory ) {
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

            addHighLimitPropertyDescriptor( object );
            addLowLimitPropertyDescriptor( object );
            addPowerDirectionFlagPropertyDescriptor( object );
            addRelayDelayTimePropertyDescriptor( object );
            addUnitMultiplierPropertyDescriptor( object );
            addUnitSymbolPropertyDescriptor( object );
            addProtectedSwitchesPropertyDescriptor( object );
            addConductingEquipmentsPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the High Limit feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addHighLimitPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_ProtectionEquipment_highLimit_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_ProtectionEquipment_highLimit_feature",
                        "_UI_ProtectionEquipment_type" ),
                CimPackage.eINSTANCE.getProtectionEquipment_HighLimit(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Low Limit feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLowLimitPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_ProtectionEquipment_lowLimit_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_ProtectionEquipment_lowLimit_feature",
                        "_UI_ProtectionEquipment_type" ),
                CimPackage.eINSTANCE.getProtectionEquipment_LowLimit(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Power Direction Flag feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPowerDirectionFlagPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ProtectionEquipment_powerDirectionFlag_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_ProtectionEquipment_powerDirectionFlag_feature", "_UI_ProtectionEquipment_type" ),
                        CimPackage.eINSTANCE.getProtectionEquipment_PowerDirectionFlag(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Relay Delay Time feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRelayDelayTimePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_ProtectionEquipment_relayDelayTime_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_ProtectionEquipment_relayDelayTime_feature",
                        "_UI_ProtectionEquipment_type" ),
                CimPackage.eINSTANCE.getProtectionEquipment_RelayDelayTime(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Unit Multiplier feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUnitMultiplierPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_ProtectionEquipment_unitMultiplier_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_ProtectionEquipment_unitMultiplier_feature",
                        "_UI_ProtectionEquipment_type" ),
                CimPackage.eINSTANCE.getProtectionEquipment_UnitMultiplier(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Unit Symbol feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUnitSymbolPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_ProtectionEquipment_unitSymbol_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_ProtectionEquipment_unitSymbol_feature",
                        "_UI_ProtectionEquipment_type" ),
                CimPackage.eINSTANCE.getProtectionEquipment_UnitSymbol(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Protected Switches feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addProtectedSwitchesPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ProtectionEquipment_ProtectedSwitches_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_ProtectionEquipment_ProtectedSwitches_feature", "_UI_ProtectionEquipment_type" ),
                        CimPackage.eINSTANCE.getProtectionEquipment_ProtectedSwitches(), true, false, true, null, null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Conducting Equipments feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addConductingEquipmentsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_ProtectionEquipment_ConductingEquipments_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_ProtectionEquipment_ConductingEquipments_feature",
                        "_UI_ProtectionEquipment_type" ),
                CimPackage.eINSTANCE.getProtectionEquipment_ConductingEquipments(), true, false, true, null, null,
                null ) );
    }

    /**
     * This returns ProtectionEquipment.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/ProtectionEquipment" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( ProtectionEquipment ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_ProtectionEquipment_type" )
                : getString( "_UI_ProtectionEquipment_type" ) + " " + label;
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

        switch( notification.getFeatureID( ProtectionEquipment.class ) ) {
        case CimPackage.PROTECTION_EQUIPMENT__HIGH_LIMIT:
        case CimPackage.PROTECTION_EQUIPMENT__LOW_LIMIT:
        case CimPackage.PROTECTION_EQUIPMENT__POWER_DIRECTION_FLAG:
        case CimPackage.PROTECTION_EQUIPMENT__RELAY_DELAY_TIME:
        case CimPackage.PROTECTION_EQUIPMENT__UNIT_MULTIPLIER:
        case CimPackage.PROTECTION_EQUIPMENT__UNIT_SYMBOL:
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
