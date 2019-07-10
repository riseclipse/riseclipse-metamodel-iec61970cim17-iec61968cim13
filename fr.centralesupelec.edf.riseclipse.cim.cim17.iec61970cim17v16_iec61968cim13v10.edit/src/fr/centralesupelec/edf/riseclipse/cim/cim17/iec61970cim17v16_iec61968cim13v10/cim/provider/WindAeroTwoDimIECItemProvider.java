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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindAeroTwoDimIEC;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindAeroTwoDimIEC} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class WindAeroTwoDimIECItemProvider extends IdentifiedObjectItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WindAeroTwoDimIECItemProvider( AdapterFactory adapterFactory ) {
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

            addDpomegaPropertyDescriptor( object );
            addDpthetaPropertyDescriptor( object );
            addDpv1PropertyDescriptor( object );
            addOmegazeroPropertyDescriptor( object );
            addPavailPropertyDescriptor( object );
            addThetav2PropertyDescriptor( object );
            addThetazeroPropertyDescriptor( object );
            addWindTurbineType3IECPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Dpomega feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDpomegaPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_WindAeroTwoDimIEC_dpomega_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindAeroTwoDimIEC_dpomega_feature",
                                "_UI_WindAeroTwoDimIEC_type" ),
                        CimPackage.eINSTANCE.getWindAeroTwoDimIEC_Dpomega(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Dptheta feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDpthetaPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_WindAeroTwoDimIEC_dptheta_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindAeroTwoDimIEC_dptheta_feature",
                                "_UI_WindAeroTwoDimIEC_type" ),
                        CimPackage.eINSTANCE.getWindAeroTwoDimIEC_Dptheta(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Dpv1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDpv1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_WindAeroTwoDimIEC_dpv1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindAeroTwoDimIEC_dpv1_feature",
                                "_UI_WindAeroTwoDimIEC_type" ),
                        CimPackage.eINSTANCE.getWindAeroTwoDimIEC_Dpv1(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Omegazero feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addOmegazeroPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_WindAeroTwoDimIEC_omegazero_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindAeroTwoDimIEC_omegazero_feature",
                                "_UI_WindAeroTwoDimIEC_type" ),
                        CimPackage.eINSTANCE.getWindAeroTwoDimIEC_Omegazero(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Pavail feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPavailPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_WindAeroTwoDimIEC_pavail_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindAeroTwoDimIEC_pavail_feature",
                                "_UI_WindAeroTwoDimIEC_type" ),
                        CimPackage.eINSTANCE.getWindAeroTwoDimIEC_Pavail(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Thetav2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addThetav2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_WindAeroTwoDimIEC_thetav2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindAeroTwoDimIEC_thetav2_feature",
                                "_UI_WindAeroTwoDimIEC_type" ),
                        CimPackage.eINSTANCE.getWindAeroTwoDimIEC_Thetav2(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Thetazero feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addThetazeroPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_WindAeroTwoDimIEC_thetazero_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindAeroTwoDimIEC_thetazero_feature",
                                "_UI_WindAeroTwoDimIEC_type" ),
                        CimPackage.eINSTANCE.getWindAeroTwoDimIEC_Thetazero(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Wind Turbine Type3 IEC feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addWindTurbineType3IECPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_WindAeroTwoDimIEC_WindTurbineType3IEC_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_WindAeroTwoDimIEC_WindTurbineType3IEC_feature", "_UI_WindAeroTwoDimIEC_type" ),
                        CimPackage.eINSTANCE.getWindAeroTwoDimIEC_WindTurbineType3IEC(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This returns WindAeroTwoDimIEC.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/WindAeroTwoDimIEC" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( WindAeroTwoDimIEC ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_WindAeroTwoDimIEC_type" )
                : getString( "_UI_WindAeroTwoDimIEC_type" ) + " " + label;
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

        switch( notification.getFeatureID( WindAeroTwoDimIEC.class ) ) {
        case CimPackage.WIND_AERO_TWO_DIM_IEC__DPOMEGA:
        case CimPackage.WIND_AERO_TWO_DIM_IEC__DPTHETA:
        case CimPackage.WIND_AERO_TWO_DIM_IEC__DPV1:
        case CimPackage.WIND_AERO_TWO_DIM_IEC__OMEGAZERO:
        case CimPackage.WIND_AERO_TWO_DIM_IEC__PAVAIL:
        case CimPackage.WIND_AERO_TWO_DIM_IEC__THETAV2:
        case CimPackage.WIND_AERO_TWO_DIM_IEC__THETAZERO:
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
