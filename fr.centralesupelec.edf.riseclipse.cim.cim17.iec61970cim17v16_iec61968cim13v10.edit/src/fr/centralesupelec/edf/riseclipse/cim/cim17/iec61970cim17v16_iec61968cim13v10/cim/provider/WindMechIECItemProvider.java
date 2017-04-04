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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindMechIEC;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindMechIEC} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class WindMechIECItemProvider extends IdentifiedObjectItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WindMechIECItemProvider( AdapterFactory adapterFactory ) {
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

            addCdrtPropertyDescriptor( object );
            addHgenPropertyDescriptor( object );
            addHwtrPropertyDescriptor( object );
            addKdrtPropertyDescriptor( object );
            addWindTurbineType1or2IECPropertyDescriptor( object );
            addWindTurbineType3IECPropertyDescriptor( object );
            addWindTurbineType4bIECPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Cdrt feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCdrtPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_WindMechIEC_cdrt_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindMechIEC_cdrt_feature",
                                "_UI_WindMechIEC_type" ),
                        CimPackage.eINSTANCE.getWindMechIEC_Cdrt(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Hgen feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addHgenPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_WindMechIEC_hgen_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindMechIEC_hgen_feature",
                                "_UI_WindMechIEC_type" ),
                        CimPackage.eINSTANCE.getWindMechIEC_Hgen(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Hwtr feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addHwtrPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_WindMechIEC_hwtr_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindMechIEC_hwtr_feature",
                                "_UI_WindMechIEC_type" ),
                        CimPackage.eINSTANCE.getWindMechIEC_Hwtr(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Kdrt feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKdrtPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_WindMechIEC_kdrt_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindMechIEC_kdrt_feature",
                                "_UI_WindMechIEC_type" ),
                        CimPackage.eINSTANCE.getWindMechIEC_Kdrt(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Wind Turbine Type1or2 IEC feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addWindTurbineType1or2IECPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_WindMechIEC_WindTurbineType1or2IEC_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_WindMechIEC_WindTurbineType1or2IEC_feature",
                        "_UI_WindMechIEC_type" ),
                CimPackage.eINSTANCE.getWindMechIEC_WindTurbineType1or2IEC(), true, false, true, null, null, null ) );
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
                        getResourceLocator(), getString( "_UI_WindMechIEC_WindTurbineType3IEC_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindMechIEC_WindTurbineType3IEC_feature",
                                "_UI_WindMechIEC_type" ),
                        CimPackage.eINSTANCE.getWindMechIEC_WindTurbineType3IEC(), true, false, true, null, null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Wind Turbine Type4b IEC feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addWindTurbineType4bIECPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_WindMechIEC_WindTurbineType4bIEC_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindMechIEC_WindTurbineType4bIEC_feature",
                                "_UI_WindMechIEC_type" ),
                        CimPackage.eINSTANCE.getWindMechIEC_WindTurbineType4bIEC(), true, false, true, null, null,
                        null ) );
    }

    /**
     * This returns WindMechIEC.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/WindMechIEC" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( WindMechIEC ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_WindMechIEC_type" )
                : getString( "_UI_WindMechIEC_type" ) + " " + label;
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

        switch( notification.getFeatureID( WindMechIEC.class ) ) {
        case CimPackage.WIND_MECH_IEC__CDRT:
        case CimPackage.WIND_MECH_IEC__HGEN:
        case CimPackage.WIND_MECH_IEC__HWTR:
        case CimPackage.WIND_MECH_IEC__KDRT:
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
