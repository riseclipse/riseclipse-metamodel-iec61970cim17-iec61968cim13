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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindPitchContPowerIEC;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindPitchContPowerIEC} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class WindPitchContPowerIECItemProvider extends IdentifiedObjectItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WindPitchContPowerIECItemProvider( AdapterFactory adapterFactory ) {
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

            addDpmaxPropertyDescriptor( object );
            addDpminPropertyDescriptor( object );
            addPminPropertyDescriptor( object );
            addPsetPropertyDescriptor( object );
            addT1PropertyDescriptor( object );
            addTrPropertyDescriptor( object );
            addUuvrtPropertyDescriptor( object );
            addWindDynamicsLookupTablePropertyDescriptor( object );
            addWindGenTurbineType2IECPropertyDescriptor( object );
            addWindGenTurbineType1bIECPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Dpmax feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDpmaxPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_WindPitchContPowerIEC_dpmax_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_WindPitchContPowerIEC_dpmax_feature",
                        "_UI_WindPitchContPowerIEC_type" ),
                CimPackage.eINSTANCE.getWindPitchContPowerIEC_Dpmax(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Dpmin feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDpminPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_WindPitchContPowerIEC_dpmin_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_WindPitchContPowerIEC_dpmin_feature",
                        "_UI_WindPitchContPowerIEC_type" ),
                CimPackage.eINSTANCE.getWindPitchContPowerIEC_Dpmin(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Pmin feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPminPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_WindPitchContPowerIEC_pmin_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_WindPitchContPowerIEC_pmin_feature",
                        "_UI_WindPitchContPowerIEC_type" ),
                CimPackage.eINSTANCE.getWindPitchContPowerIEC_Pmin(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Pset feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPsetPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_WindPitchContPowerIEC_pset_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_WindPitchContPowerIEC_pset_feature",
                        "_UI_WindPitchContPowerIEC_type" ),
                CimPackage.eINSTANCE.getWindPitchContPowerIEC_Pset(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the T1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addT1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_WindPitchContPowerIEC_t1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindPitchContPowerIEC_t1_feature",
                                "_UI_WindPitchContPowerIEC_type" ),
                        CimPackage.eINSTANCE.getWindPitchContPowerIEC_T1(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tr feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTrPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_WindPitchContPowerIEC_tr_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindPitchContPowerIEC_tr_feature",
                                "_UI_WindPitchContPowerIEC_type" ),
                        CimPackage.eINSTANCE.getWindPitchContPowerIEC_Tr(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Uuvrt feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUuvrtPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_WindPitchContPowerIEC_uuvrt_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_WindPitchContPowerIEC_uuvrt_feature",
                        "_UI_WindPitchContPowerIEC_type" ),
                CimPackage.eINSTANCE.getWindPitchContPowerIEC_Uuvrt(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Wind Dynamics Lookup Table feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addWindDynamicsLookupTablePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_WindPitchContPowerIEC_WindDynamicsLookupTable_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_WindPitchContPowerIEC_WindDynamicsLookupTable_feature", "_UI_WindPitchContPowerIEC_type" ),
                CimPackage.eINSTANCE.getWindPitchContPowerIEC_WindDynamicsLookupTable(), true, false, true, null, null,
                null ) );
    }

    /**
     * This adds a property descriptor for the Wind Gen Turbine Type2 IEC feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addWindGenTurbineType2IECPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_WindPitchContPowerIEC_WindGenTurbineType2IEC_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_WindPitchContPowerIEC_WindGenTurbineType2IEC_feature", "_UI_WindPitchContPowerIEC_type" ),
                CimPackage.eINSTANCE.getWindPitchContPowerIEC_WindGenTurbineType2IEC(), true, false, true, null, null,
                null ) );
    }

    /**
     * This adds a property descriptor for the Wind Gen Turbine Type1b IEC feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addWindGenTurbineType1bIECPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_WindPitchContPowerIEC_WindGenTurbineType1bIEC_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_WindPitchContPowerIEC_WindGenTurbineType1bIEC_feature", "_UI_WindPitchContPowerIEC_type" ),
                CimPackage.eINSTANCE.getWindPitchContPowerIEC_WindGenTurbineType1bIEC(), true, false, true, null, null,
                null ) );
    }

    /**
     * This returns WindPitchContPowerIEC.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/WindPitchContPowerIEC" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( WindPitchContPowerIEC ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_WindPitchContPowerIEC_type" )
                : getString( "_UI_WindPitchContPowerIEC_type" ) + " " + label;
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

        switch( notification.getFeatureID( WindPitchContPowerIEC.class ) ) {
        case CimPackage.WIND_PITCH_CONT_POWER_IEC__DPMAX:
        case CimPackage.WIND_PITCH_CONT_POWER_IEC__DPMIN:
        case CimPackage.WIND_PITCH_CONT_POWER_IEC__PMIN:
        case CimPackage.WIND_PITCH_CONT_POWER_IEC__PSET:
        case CimPackage.WIND_PITCH_CONT_POWER_IEC__T1:
        case CimPackage.WIND_PITCH_CONT_POWER_IEC__TR:
        case CimPackage.WIND_PITCH_CONT_POWER_IEC__UUVRT:
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
