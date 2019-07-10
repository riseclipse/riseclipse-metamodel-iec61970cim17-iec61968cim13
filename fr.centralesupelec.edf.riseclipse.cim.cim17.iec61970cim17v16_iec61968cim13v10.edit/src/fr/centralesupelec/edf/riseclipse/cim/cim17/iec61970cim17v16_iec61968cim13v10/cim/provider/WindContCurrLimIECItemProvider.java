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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContCurrLimIEC;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContCurrLimIEC} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class WindContCurrLimIECItemProvider extends IdentifiedObjectItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WindContCurrLimIECItemProvider( AdapterFactory adapterFactory ) {
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

            addImaxPropertyDescriptor( object );
            addImaxdipPropertyDescriptor( object );
            addKpquPropertyDescriptor( object );
            addMdfslimPropertyDescriptor( object );
            addMqpriPropertyDescriptor( object );
            addTufiltclPropertyDescriptor( object );
            addUpqumaxPropertyDescriptor( object );
            addWindDynamicsLookupTablePropertyDescriptor( object );
            addWindTurbineType3or4IECPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Imax feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addImaxPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_WindContCurrLimIEC_imax_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindContCurrLimIEC_imax_feature",
                                "_UI_WindContCurrLimIEC_type" ),
                        CimPackage.eINSTANCE.getWindContCurrLimIEC_Imax(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Imaxdip feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addImaxdipPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_WindContCurrLimIEC_imaxdip_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindContCurrLimIEC_imaxdip_feature",
                                "_UI_WindContCurrLimIEC_type" ),
                        CimPackage.eINSTANCE.getWindContCurrLimIEC_Imaxdip(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Kpqu feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKpquPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_WindContCurrLimIEC_kpqu_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindContCurrLimIEC_kpqu_feature",
                                "_UI_WindContCurrLimIEC_type" ),
                        CimPackage.eINSTANCE.getWindContCurrLimIEC_Kpqu(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Mdfslim feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMdfslimPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_WindContCurrLimIEC_mdfslim_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindContCurrLimIEC_mdfslim_feature",
                                "_UI_WindContCurrLimIEC_type" ),
                        CimPackage.eINSTANCE.getWindContCurrLimIEC_Mdfslim(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Mqpri feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMqpriPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_WindContCurrLimIEC_mqpri_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindContCurrLimIEC_mqpri_feature",
                                "_UI_WindContCurrLimIEC_type" ),
                        CimPackage.eINSTANCE.getWindContCurrLimIEC_Mqpri(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Tufiltcl feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTufiltclPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_WindContCurrLimIEC_tufiltcl_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindContCurrLimIEC_tufiltcl_feature",
                                "_UI_WindContCurrLimIEC_type" ),
                        CimPackage.eINSTANCE.getWindContCurrLimIEC_Tufiltcl(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Upqumax feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUpqumaxPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_WindContCurrLimIEC_upqumax_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindContCurrLimIEC_upqumax_feature",
                                "_UI_WindContCurrLimIEC_type" ),
                        CimPackage.eINSTANCE.getWindContCurrLimIEC_Upqumax(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Wind Dynamics Lookup Table feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addWindDynamicsLookupTablePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                getResourceLocator(),
                getString( "_UI_WindContCurrLimIEC_WindDynamicsLookupTable_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_WindContCurrLimIEC_WindDynamicsLookupTable_feature", "_UI_WindContCurrLimIEC_type" ),
                CimPackage.eINSTANCE.getWindContCurrLimIEC_WindDynamicsLookupTable(),
                true,
                false,
                true,
                null,
                null,
                null ) );
    }

    /**
     * This adds a property descriptor for the Wind Turbine Type3or4 IEC feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addWindTurbineType3or4IECPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                getResourceLocator(),
                getString( "_UI_WindContCurrLimIEC_WindTurbineType3or4IEC_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_WindContCurrLimIEC_WindTurbineType3or4IEC_feature", "_UI_WindContCurrLimIEC_type" ),
                CimPackage.eINSTANCE.getWindContCurrLimIEC_WindTurbineType3or4IEC(),
                true,
                false,
                true,
                null,
                null,
                null ) );
    }

    /**
     * This returns WindContCurrLimIEC.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/WindContCurrLimIEC" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( WindContCurrLimIEC ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_WindContCurrLimIEC_type" )
                : getString( "_UI_WindContCurrLimIEC_type" ) + " " + label;
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

        switch( notification.getFeatureID( WindContCurrLimIEC.class ) ) {
        case CimPackage.WIND_CONT_CURR_LIM_IEC__IMAX:
        case CimPackage.WIND_CONT_CURR_LIM_IEC__IMAXDIP:
        case CimPackage.WIND_CONT_CURR_LIM_IEC__KPQU:
        case CimPackage.WIND_CONT_CURR_LIM_IEC__MDFSLIM:
        case CimPackage.WIND_CONT_CURR_LIM_IEC__MQPRI:
        case CimPackage.WIND_CONT_CURR_LIM_IEC__TUFILTCL:
        case CimPackage.WIND_CONT_CURR_LIM_IEC__UPQUMAX:
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
