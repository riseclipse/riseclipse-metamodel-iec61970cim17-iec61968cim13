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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPitchAngleIEC;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPitchAngleIEC} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class WindContPitchAngleIECItemProvider extends IdentifiedObjectItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WindContPitchAngleIECItemProvider( AdapterFactory adapterFactory ) {
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

            addDthetamaxPropertyDescriptor( object );
            addDthetaminPropertyDescriptor( object );
            addKicPropertyDescriptor( object );
            addKiomegaPropertyDescriptor( object );
            addKpcPropertyDescriptor( object );
            addKpomegaPropertyDescriptor( object );
            addKpxPropertyDescriptor( object );
            addThetamaxPropertyDescriptor( object );
            addThetaminPropertyDescriptor( object );
            addTthetaPropertyDescriptor( object );
            addWindTurbineType3IECPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Dthetamax feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDthetamaxPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_WindContPitchAngleIEC_dthetamax_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_WindContPitchAngleIEC_dthetamax_feature",
                        "_UI_WindContPitchAngleIEC_type" ),
                CimPackage.eINSTANCE.getWindContPitchAngleIEC_Dthetamax(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Dthetamin feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDthetaminPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_WindContPitchAngleIEC_dthetamin_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_WindContPitchAngleIEC_dthetamin_feature",
                        "_UI_WindContPitchAngleIEC_type" ),
                CimPackage.eINSTANCE.getWindContPitchAngleIEC_Dthetamin(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Kic feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKicPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_WindContPitchAngleIEC_kic_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindContPitchAngleIEC_kic_feature",
                                "_UI_WindContPitchAngleIEC_type" ),
                        CimPackage.eINSTANCE.getWindContPitchAngleIEC_Kic(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Kiomega feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKiomegaPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_WindContPitchAngleIEC_kiomega_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_WindContPitchAngleIEC_kiomega_feature",
                        "_UI_WindContPitchAngleIEC_type" ),
                CimPackage.eINSTANCE.getWindContPitchAngleIEC_Kiomega(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Kpc feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKpcPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_WindContPitchAngleIEC_kpc_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindContPitchAngleIEC_kpc_feature",
                                "_UI_WindContPitchAngleIEC_type" ),
                        CimPackage.eINSTANCE.getWindContPitchAngleIEC_Kpc(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Kpomega feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKpomegaPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_WindContPitchAngleIEC_kpomega_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_WindContPitchAngleIEC_kpomega_feature",
                        "_UI_WindContPitchAngleIEC_type" ),
                CimPackage.eINSTANCE.getWindContPitchAngleIEC_Kpomega(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Kpx feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKpxPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_WindContPitchAngleIEC_kpx_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindContPitchAngleIEC_kpx_feature",
                                "_UI_WindContPitchAngleIEC_type" ),
                        CimPackage.eINSTANCE.getWindContPitchAngleIEC_Kpx(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Thetamax feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addThetamaxPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_WindContPitchAngleIEC_thetamax_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_WindContPitchAngleIEC_thetamax_feature",
                        "_UI_WindContPitchAngleIEC_type" ),
                CimPackage.eINSTANCE.getWindContPitchAngleIEC_Thetamax(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Thetamin feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addThetaminPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_WindContPitchAngleIEC_thetamin_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_WindContPitchAngleIEC_thetamin_feature",
                        "_UI_WindContPitchAngleIEC_type" ),
                CimPackage.eINSTANCE.getWindContPitchAngleIEC_Thetamin(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Ttheta feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTthetaPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_WindContPitchAngleIEC_ttheta_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_WindContPitchAngleIEC_ttheta_feature",
                        "_UI_WindContPitchAngleIEC_type" ),
                CimPackage.eINSTANCE.getWindContPitchAngleIEC_Ttheta(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Wind Turbine Type3 IEC feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addWindTurbineType3IECPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_WindContPitchAngleIEC_WindTurbineType3IEC_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_WindContPitchAngleIEC_WindTurbineType3IEC_feature", "_UI_WindContPitchAngleIEC_type" ),
                CimPackage.eINSTANCE.getWindContPitchAngleIEC_WindTurbineType3IEC(), true, false, true, null, null,
                null ) );
    }

    /**
     * This returns WindContPitchAngleIEC.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/WindContPitchAngleIEC" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( WindContPitchAngleIEC ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_WindContPitchAngleIEC_type" )
                : getString( "_UI_WindContPitchAngleIEC_type" ) + " " + label;
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

        switch( notification.getFeatureID( WindContPitchAngleIEC.class ) ) {
        case CimPackage.WIND_CONT_PITCH_ANGLE_IEC__DTHETAMAX:
        case CimPackage.WIND_CONT_PITCH_ANGLE_IEC__DTHETAMIN:
        case CimPackage.WIND_CONT_PITCH_ANGLE_IEC__KIC:
        case CimPackage.WIND_CONT_PITCH_ANGLE_IEC__KIOMEGA:
        case CimPackage.WIND_CONT_PITCH_ANGLE_IEC__KPC:
        case CimPackage.WIND_CONT_PITCH_ANGLE_IEC__KPOMEGA:
        case CimPackage.WIND_CONT_PITCH_ANGLE_IEC__KPX:
        case CimPackage.WIND_CONT_PITCH_ANGLE_IEC__THETAMAX:
        case CimPackage.WIND_CONT_PITCH_ANGLE_IEC__THETAMIN:
        case CimPackage.WIND_CONT_PITCH_ANGLE_IEC__TTHETA:
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
