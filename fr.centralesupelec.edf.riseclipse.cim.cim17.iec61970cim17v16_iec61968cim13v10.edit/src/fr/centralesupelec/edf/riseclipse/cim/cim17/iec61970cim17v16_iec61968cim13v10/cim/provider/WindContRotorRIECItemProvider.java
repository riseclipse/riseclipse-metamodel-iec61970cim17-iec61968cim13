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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContRotorRIEC;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContRotorRIEC} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class WindContRotorRIECItemProvider extends IdentifiedObjectItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WindContRotorRIECItemProvider( AdapterFactory adapterFactory ) {
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

            addKirrPropertyDescriptor( object );
            addKomegafiltPropertyDescriptor( object );
            addKpfiltPropertyDescriptor( object );
            addKprrPropertyDescriptor( object );
            addRmaxPropertyDescriptor( object );
            addRminPropertyDescriptor( object );
            addTomegafiltrrPropertyDescriptor( object );
            addTpfiltrrPropertyDescriptor( object );
            addWindGenTurbineType2IECPropertyDescriptor( object );
            addWindDynamicsLookupTablePropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Kirr feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKirrPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_WindContRotorRIEC_kirr_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindContRotorRIEC_kirr_feature",
                                "_UI_WindContRotorRIEC_type" ),
                        CimPackage.eINSTANCE.getWindContRotorRIEC_Kirr(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Komegafilt feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKomegafiltPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_WindContRotorRIEC_komegafilt_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindContRotorRIEC_komegafilt_feature",
                                "_UI_WindContRotorRIEC_type" ),
                        CimPackage.eINSTANCE.getWindContRotorRIEC_Komegafilt(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Kpfilt feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKpfiltPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_WindContRotorRIEC_kpfilt_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindContRotorRIEC_kpfilt_feature",
                                "_UI_WindContRotorRIEC_type" ),
                        CimPackage.eINSTANCE.getWindContRotorRIEC_Kpfilt(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Kprr feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKprrPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_WindContRotorRIEC_kprr_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindContRotorRIEC_kprr_feature",
                                "_UI_WindContRotorRIEC_type" ),
                        CimPackage.eINSTANCE.getWindContRotorRIEC_Kprr(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Rmax feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRmaxPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_WindContRotorRIEC_rmax_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindContRotorRIEC_rmax_feature",
                                "_UI_WindContRotorRIEC_type" ),
                        CimPackage.eINSTANCE.getWindContRotorRIEC_Rmax(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Rmin feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRminPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_WindContRotorRIEC_rmin_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindContRotorRIEC_rmin_feature",
                                "_UI_WindContRotorRIEC_type" ),
                        CimPackage.eINSTANCE.getWindContRotorRIEC_Rmin(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tomegafiltrr feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTomegafiltrrPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_WindContRotorRIEC_tomegafiltrr_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_WindContRotorRIEC_tomegafiltrr_feature",
                        "_UI_WindContRotorRIEC_type" ),
                CimPackage.eINSTANCE.getWindContRotorRIEC_Tomegafiltrr(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tpfiltrr feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTpfiltrrPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_WindContRotorRIEC_tpfiltrr_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindContRotorRIEC_tpfiltrr_feature",
                                "_UI_WindContRotorRIEC_type" ),
                        CimPackage.eINSTANCE.getWindContRotorRIEC_Tpfiltrr(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Wind Gen Turbine Type2 IEC feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addWindGenTurbineType2IECPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_WindContRotorRIEC_WindGenTurbineType2IEC_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_WindContRotorRIEC_WindGenTurbineType2IEC_feature", "_UI_WindContRotorRIEC_type" ),
                        CimPackage.eINSTANCE.getWindContRotorRIEC_WindGenTurbineType2IEC(), true, false, true, null,
                        null, null ) );
    }

    /**
     * This adds a property descriptor for the Wind Dynamics Lookup Table feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addWindDynamicsLookupTablePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_WindContRotorRIEC_WindDynamicsLookupTable_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_WindContRotorRIEC_WindDynamicsLookupTable_feature", "_UI_WindContRotorRIEC_type" ),
                        CimPackage.eINSTANCE.getWindContRotorRIEC_WindDynamicsLookupTable(), true, false, true, null,
                        null, null ) );
    }

    /**
     * This returns WindContRotorRIEC.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/WindContRotorRIEC" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( WindContRotorRIEC ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_WindContRotorRIEC_type" )
                : getString( "_UI_WindContRotorRIEC_type" ) + " " + label;
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

        switch( notification.getFeatureID( WindContRotorRIEC.class ) ) {
        case CimPackage.WIND_CONT_ROTOR_RIEC__KIRR:
        case CimPackage.WIND_CONT_ROTOR_RIEC__KOMEGAFILT:
        case CimPackage.WIND_CONT_ROTOR_RIEC__KPFILT:
        case CimPackage.WIND_CONT_ROTOR_RIEC__KPRR:
        case CimPackage.WIND_CONT_ROTOR_RIEC__RMAX:
        case CimPackage.WIND_CONT_ROTOR_RIEC__RMIN:
        case CimPackage.WIND_CONT_ROTOR_RIEC__TOMEGAFILTRR:
        case CimPackage.WIND_CONT_ROTOR_RIEC__TPFILTRR:
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
