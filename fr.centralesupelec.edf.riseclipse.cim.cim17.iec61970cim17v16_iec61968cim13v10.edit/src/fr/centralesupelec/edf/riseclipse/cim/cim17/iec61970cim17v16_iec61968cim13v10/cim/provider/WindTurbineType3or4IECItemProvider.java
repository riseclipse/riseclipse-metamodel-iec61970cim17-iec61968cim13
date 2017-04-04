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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindTurbineType3or4IEC;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindTurbineType3or4IEC} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class WindTurbineType3or4IECItemProvider extends WindTurbineType3or4DynamicsItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WindTurbineType3or4IECItemProvider( AdapterFactory adapterFactory ) {
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

            addWindContCurrLimIECPropertyDescriptor( object );
            addWindRefFrameRotIECPropertyDescriptor( object );
            addWindProtectionIECPropertyDescriptor( object );
            addWindContQLimIECPropertyDescriptor( object );
            addWIndContQIECPropertyDescriptor( object );
            addWindContQPQULimIECPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Wind Cont Curr Lim IEC feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addWindContCurrLimIECPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_WindTurbineType3or4IEC_WindContCurrLimIEC_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_WindTurbineType3or4IEC_WindContCurrLimIEC_feature", "_UI_WindTurbineType3or4IEC_type" ),
                CimPackage.eINSTANCE.getWindTurbineType3or4IEC_WindContCurrLimIEC(), true, false, true, null, null,
                null ) );
    }

    /**
     * This adds a property descriptor for the Wind Ref Frame Rot IEC feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addWindRefFrameRotIECPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_WindTurbineType3or4IEC_WindRefFrameRotIEC_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_WindTurbineType3or4IEC_WindRefFrameRotIEC_feature", "_UI_WindTurbineType3or4IEC_type" ),
                CimPackage.eINSTANCE.getWindTurbineType3or4IEC_WindRefFrameRotIEC(), true, false, true, null, null,
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
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_WindTurbineType3or4IEC_WindProtectionIEC_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_WindTurbineType3or4IEC_WindProtectionIEC_feature",
                        "_UI_WindTurbineType3or4IEC_type" ),
                CimPackage.eINSTANCE.getWindTurbineType3or4IEC_WindProtectionIEC(), true, false, true, null, null,
                null ) );
    }

    /**
     * This adds a property descriptor for the Wind Cont QLim IEC feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addWindContQLimIECPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_WindTurbineType3or4IEC_WindContQLimIEC_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_WindTurbineType3or4IEC_WindContQLimIEC_feature",
                        "_UI_WindTurbineType3or4IEC_type" ),
                CimPackage.eINSTANCE.getWindTurbineType3or4IEC_WindContQLimIEC(), true, false, true, null, null,
                null ) );
    }

    /**
     * This adds a property descriptor for the WInd Cont QIEC feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addWIndContQIECPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_WindTurbineType3or4IEC_WIndContQIEC_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_WindTurbineType3or4IEC_WIndContQIEC_feature",
                        "_UI_WindTurbineType3or4IEC_type" ),
                CimPackage.eINSTANCE.getWindTurbineType3or4IEC_WIndContQIEC(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Wind Cont QPQU Lim IEC feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addWindContQPQULimIECPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_WindTurbineType3or4IEC_WindContQPQULimIEC_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_WindTurbineType3or4IEC_WindContQPQULimIEC_feature", "_UI_WindTurbineType3or4IEC_type" ),
                CimPackage.eINSTANCE.getWindTurbineType3or4IEC_WindContQPQULimIEC(), true, false, true, null, null,
                null ) );
    }

    /**
     * This returns WindTurbineType3or4IEC.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/WindTurbineType3or4IEC" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( WindTurbineType3or4IEC ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_WindTurbineType3or4IEC_type" )
                : getString( "_UI_WindTurbineType3or4IEC_type" ) + " " + label;
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
