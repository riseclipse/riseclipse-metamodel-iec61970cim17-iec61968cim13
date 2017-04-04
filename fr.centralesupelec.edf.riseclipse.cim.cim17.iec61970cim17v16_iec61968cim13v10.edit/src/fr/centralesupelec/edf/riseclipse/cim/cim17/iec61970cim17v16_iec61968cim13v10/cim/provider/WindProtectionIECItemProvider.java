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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindProtectionIEC;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindProtectionIEC} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class WindProtectionIECItemProvider extends IdentifiedObjectItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WindProtectionIECItemProvider( AdapterFactory adapterFactory ) {
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

            addDfimaxPropertyDescriptor( object );
            addFoverPropertyDescriptor( object );
            addFunderPropertyDescriptor( object );
            addMzcPropertyDescriptor( object );
            addTfmaPropertyDescriptor( object );
            addUoverPropertyDescriptor( object );
            addUunderPropertyDescriptor( object );
            addWindTurbineType3or4IECPropertyDescriptor( object );
            addWindTurbineType1or2IECPropertyDescriptor( object );
            addWindDynamicsLookupTablePropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Dfimax feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDfimaxPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_WindProtectionIEC_dfimax_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindProtectionIEC_dfimax_feature",
                                "_UI_WindProtectionIEC_type" ),
                        CimPackage.eINSTANCE.getWindProtectionIEC_Dfimax(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Fover feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFoverPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_WindProtectionIEC_fover_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindProtectionIEC_fover_feature",
                                "_UI_WindProtectionIEC_type" ),
                        CimPackage.eINSTANCE.getWindProtectionIEC_Fover(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Funder feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFunderPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_WindProtectionIEC_funder_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindProtectionIEC_funder_feature",
                                "_UI_WindProtectionIEC_type" ),
                        CimPackage.eINSTANCE.getWindProtectionIEC_Funder(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Mzc feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMzcPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_WindProtectionIEC_mzc_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindProtectionIEC_mzc_feature",
                                "_UI_WindProtectionIEC_type" ),
                        CimPackage.eINSTANCE.getWindProtectionIEC_Mzc(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tfma feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTfmaPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_WindProtectionIEC_tfma_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindProtectionIEC_tfma_feature",
                                "_UI_WindProtectionIEC_type" ),
                        CimPackage.eINSTANCE.getWindProtectionIEC_Tfma(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Uover feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUoverPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_WindProtectionIEC_uover_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindProtectionIEC_uover_feature",
                                "_UI_WindProtectionIEC_type" ),
                        CimPackage.eINSTANCE.getWindProtectionIEC_Uover(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Uunder feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUunderPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_WindProtectionIEC_uunder_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindProtectionIEC_uunder_feature",
                                "_UI_WindProtectionIEC_type" ),
                        CimPackage.eINSTANCE.getWindProtectionIEC_Uunder(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Wind Turbine Type3or4 IEC feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addWindTurbineType3or4IECPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_WindProtectionIEC_WindTurbineType3or4IEC_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_WindProtectionIEC_WindTurbineType3or4IEC_feature", "_UI_WindProtectionIEC_type" ),
                        CimPackage.eINSTANCE.getWindProtectionIEC_WindTurbineType3or4IEC(), true, false, true, null,
                        null, null ) );
    }

    /**
     * This adds a property descriptor for the Wind Turbine Type1or2 IEC feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addWindTurbineType1or2IECPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_WindProtectionIEC_WindTurbineType1or2IEC_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_WindProtectionIEC_WindTurbineType1or2IEC_feature", "_UI_WindProtectionIEC_type" ),
                        CimPackage.eINSTANCE.getWindProtectionIEC_WindTurbineType1or2IEC(), true, false, true, null,
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
                        getResourceLocator(), getString( "_UI_WindProtectionIEC_WindDynamicsLookupTable_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_WindProtectionIEC_WindDynamicsLookupTable_feature", "_UI_WindProtectionIEC_type" ),
                        CimPackage.eINSTANCE.getWindProtectionIEC_WindDynamicsLookupTable(), true, false, true, null,
                        null, null ) );
    }

    /**
     * This returns WindProtectionIEC.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/WindProtectionIEC" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( WindProtectionIEC ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_WindProtectionIEC_type" )
                : getString( "_UI_WindProtectionIEC_type" ) + " " + label;
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

        switch( notification.getFeatureID( WindProtectionIEC.class ) ) {
        case CimPackage.WIND_PROTECTION_IEC__DFIMAX:
        case CimPackage.WIND_PROTECTION_IEC__FOVER:
        case CimPackage.WIND_PROTECTION_IEC__FUNDER:
        case CimPackage.WIND_PROTECTION_IEC__MZC:
        case CimPackage.WIND_PROTECTION_IEC__TFMA:
        case CimPackage.WIND_PROTECTION_IEC__UOVER:
        case CimPackage.WIND_PROTECTION_IEC__UUNDER:
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
