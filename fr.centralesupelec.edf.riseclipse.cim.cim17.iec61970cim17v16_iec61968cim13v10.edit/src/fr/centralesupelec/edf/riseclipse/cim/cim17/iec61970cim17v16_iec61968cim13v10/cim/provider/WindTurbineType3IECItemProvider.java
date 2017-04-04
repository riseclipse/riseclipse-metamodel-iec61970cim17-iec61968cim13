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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindTurbineType3IEC;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindTurbineType3IEC} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class WindTurbineType3IECItemProvider extends WindTurbineType3or4IECItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WindTurbineType3IECItemProvider( AdapterFactory adapterFactory ) {
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

            addWindAeroOneDimIECPropertyDescriptor( object );
            addWindAeroTwoDimIECPropertyDescriptor( object );
            addWindMechIECPropertyDescriptor( object );
            addWindGenType3IECPropertyDescriptor( object );
            addWindContPitchAngleIECPropertyDescriptor( object );
            addWindContPType3IECPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Wind Aero One Dim IEC feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addWindAeroOneDimIECPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_WindTurbineType3IEC_WindAeroOneDimIEC_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_WindTurbineType3IEC_WindAeroOneDimIEC_feature", "_UI_WindTurbineType3IEC_type" ),
                        CimPackage.eINSTANCE.getWindTurbineType3IEC_WindAeroOneDimIEC(), true, false, true, null, null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Wind Aero Two Dim IEC feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addWindAeroTwoDimIECPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_WindTurbineType3IEC_WindAeroTwoDimIEC_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_WindTurbineType3IEC_WindAeroTwoDimIEC_feature", "_UI_WindTurbineType3IEC_type" ),
                        CimPackage.eINSTANCE.getWindTurbineType3IEC_WindAeroTwoDimIEC(), true, false, true, null, null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Wind Mech IEC feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addWindMechIECPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_WindTurbineType3IEC_WindMechIEC_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_WindTurbineType3IEC_WindMechIEC_feature",
                        "_UI_WindTurbineType3IEC_type" ),
                CimPackage.eINSTANCE.getWindTurbineType3IEC_WindMechIEC(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Wind Gen Type3 IEC feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addWindGenType3IECPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_WindTurbineType3IEC_WindGenType3IEC_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_WindTurbineType3IEC_WindGenType3IEC_feature",
                        "_UI_WindTurbineType3IEC_type" ),
                CimPackage.eINSTANCE.getWindTurbineType3IEC_WindGenType3IEC(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Wind Cont Pitch Angle IEC feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addWindContPitchAngleIECPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_WindTurbineType3IEC_WindContPitchAngleIEC_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_WindTurbineType3IEC_WindContPitchAngleIEC_feature", "_UI_WindTurbineType3IEC_type" ),
                CimPackage.eINSTANCE.getWindTurbineType3IEC_WindContPitchAngleIEC(), true, false, true, null, null,
                null ) );
    }

    /**
     * This adds a property descriptor for the Wind Cont PType3 IEC feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addWindContPType3IECPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_WindTurbineType3IEC_WindContPType3IEC_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_WindTurbineType3IEC_WindContPType3IEC_feature", "_UI_WindTurbineType3IEC_type" ),
                        CimPackage.eINSTANCE.getWindTurbineType3IEC_WindContPType3IEC(), true, false, true, null, null,
                        null ) );
    }

    /**
     * This returns WindTurbineType3IEC.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/WindTurbineType3IEC" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( WindTurbineType3IEC ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_WindTurbineType3IEC_type" )
                : getString( "_UI_WindTurbineType3IEC_type" ) + " " + label;
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
