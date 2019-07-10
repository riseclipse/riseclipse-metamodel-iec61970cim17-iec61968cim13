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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerElectronicsConnection;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerElectronicsConnection} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PowerElectronicsConnectionItemProvider extends RegulatingCondEqItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PowerElectronicsConnectionItemProvider( AdapterFactory adapterFactory ) {
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

            addMaxQPropertyDescriptor( object );
            addMinQPropertyDescriptor( object );
            addPPropertyDescriptor( object );
            addQPropertyDescriptor( object );
            addRPropertyDescriptor( object );
            addR0PropertyDescriptor( object );
            addRatedSPropertyDescriptor( object );
            addRatedUPropertyDescriptor( object );
            addRnPropertyDescriptor( object );
            addXPropertyDescriptor( object );
            addX0PropertyDescriptor( object );
            addXnPropertyDescriptor( object );
            addWindTurbineType3or4PropertyDescriptor( object );
            addPowerElectronicsUnitPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Max Q feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMaxQPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_PowerElectronicsConnection_maxQ_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PowerElectronicsConnection_maxQ_feature",
                                "_UI_PowerElectronicsConnection_type" ),
                        CimPackage.eINSTANCE.getPowerElectronicsConnection_MaxQ(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Min Q feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMinQPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_PowerElectronicsConnection_minQ_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PowerElectronicsConnection_minQ_feature",
                                "_UI_PowerElectronicsConnection_type" ),
                        CimPackage.eINSTANCE.getPowerElectronicsConnection_MinQ(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
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
                        getResourceLocator(),
                        getString( "_UI_PowerElectronicsConnection_p_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PowerElectronicsConnection_p_feature",
                                "_UI_PowerElectronicsConnection_type" ),
                        CimPackage.eINSTANCE.getPowerElectronicsConnection_P(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
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
                        getResourceLocator(),
                        getString( "_UI_PowerElectronicsConnection_q_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PowerElectronicsConnection_q_feature",
                                "_UI_PowerElectronicsConnection_type" ),
                        CimPackage.eINSTANCE.getPowerElectronicsConnection_Q(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the R feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_PowerElectronicsConnection_r_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PowerElectronicsConnection_r_feature",
                                "_UI_PowerElectronicsConnection_type" ),
                        CimPackage.eINSTANCE.getPowerElectronicsConnection_R(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the R0 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addR0PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_PowerElectronicsConnection_r0_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PowerElectronicsConnection_r0_feature",
                                "_UI_PowerElectronicsConnection_type" ),
                        CimPackage.eINSTANCE.getPowerElectronicsConnection_R0(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Rated S feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRatedSPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                getResourceLocator(),
                getString( "_UI_PowerElectronicsConnection_ratedS_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_PowerElectronicsConnection_ratedS_feature",
                        "_UI_PowerElectronicsConnection_type" ),
                CimPackage.eINSTANCE.getPowerElectronicsConnection_RatedS(),
                true,
                false,
                false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                null,
                null ) );
    }

    /**
     * This adds a property descriptor for the Rated U feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRatedUPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                getResourceLocator(),
                getString( "_UI_PowerElectronicsConnection_ratedU_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_PowerElectronicsConnection_ratedU_feature",
                        "_UI_PowerElectronicsConnection_type" ),
                CimPackage.eINSTANCE.getPowerElectronicsConnection_RatedU(),
                true,
                false,
                false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                null,
                null ) );
    }

    /**
     * This adds a property descriptor for the Rn feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRnPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_PowerElectronicsConnection_rn_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PowerElectronicsConnection_rn_feature",
                                "_UI_PowerElectronicsConnection_type" ),
                        CimPackage.eINSTANCE.getPowerElectronicsConnection_Rn(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the X feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addXPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_PowerElectronicsConnection_x_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PowerElectronicsConnection_x_feature",
                                "_UI_PowerElectronicsConnection_type" ),
                        CimPackage.eINSTANCE.getPowerElectronicsConnection_X(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the X0 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addX0PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_PowerElectronicsConnection_x0_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PowerElectronicsConnection_x0_feature",
                                "_UI_PowerElectronicsConnection_type" ),
                        CimPackage.eINSTANCE.getPowerElectronicsConnection_X0(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Xn feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addXnPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_PowerElectronicsConnection_xn_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PowerElectronicsConnection_xn_feature",
                                "_UI_PowerElectronicsConnection_type" ),
                        CimPackage.eINSTANCE.getPowerElectronicsConnection_Xn(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Wind Turbine Type3or4 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addWindTurbineType3or4PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_PowerElectronicsConnection_WindTurbineType3or4_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_PowerElectronicsConnection_WindTurbineType3or4_feature",
                                "_UI_PowerElectronicsConnection_type" ),
                        CimPackage.eINSTANCE.getPowerElectronicsConnection_WindTurbineType3or4(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Power Electronics Unit feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPowerElectronicsUnitPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_PowerElectronicsConnection_PowerElectronicsUnit_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_PowerElectronicsConnection_PowerElectronicsUnit_feature",
                                "_UI_PowerElectronicsConnection_type" ),
                        CimPackage.eINSTANCE.getPowerElectronicsConnection_PowerElectronicsUnit(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This returns PowerElectronicsConnection.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/PowerElectronicsConnection" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( PowerElectronicsConnection ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_PowerElectronicsConnection_type" )
                : getString( "_UI_PowerElectronicsConnection_type" ) + " " + label;
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

        switch( notification.getFeatureID( PowerElectronicsConnection.class ) ) {
        case CimPackage.POWER_ELECTRONICS_CONNECTION__MAX_Q:
        case CimPackage.POWER_ELECTRONICS_CONNECTION__MIN_Q:
        case CimPackage.POWER_ELECTRONICS_CONNECTION__P:
        case CimPackage.POWER_ELECTRONICS_CONNECTION__Q:
        case CimPackage.POWER_ELECTRONICS_CONNECTION__R:
        case CimPackage.POWER_ELECTRONICS_CONNECTION__R0:
        case CimPackage.POWER_ELECTRONICS_CONNECTION__RATED_S:
        case CimPackage.POWER_ELECTRONICS_CONNECTION__RATED_U:
        case CimPackage.POWER_ELECTRONICS_CONNECTION__RN:
        case CimPackage.POWER_ELECTRONICS_CONNECTION__X:
        case CimPackage.POWER_ELECTRONICS_CONNECTION__X0:
        case CimPackage.POWER_ELECTRONICS_CONNECTION__XN:
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
